package com.softsolstudio.namesofallah.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.softsolstudio.namesofallah.R;
import com.softsolstudio.namesofallah.fragment.NameDetailFragment;
import com.softsolstudio.namesofallah.utils.NamesModel;

import java.util.ArrayList;
import java.util.List;

public class NamesListAdapter extends RecyclerView.Adapter<NamesListAdapter.ViewHolder> {
    Context context;
    List<NamesModel>list;
    public NamesListAdapter(Context context, ArrayList<NamesModel> namesList) {
    this.context=context;
    this.list=namesList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.workout_view_holder,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final NamesModel Model=list.get(position);
        holder.tv_name.setText(Model.getName());
        int id = context.getResources().getIdentifier(Model.getImage(), "drawable", context.getPackageName());
        holder.imageView.setImageResource(id);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new NameDetailFragment();
                Bundle args = new Bundle();
                args.putString("desc", String.valueOf(Model.getId()));
                myFragment.setArguments(args);
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, myFragment).addToBackStack(null).commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        CardView cardView;
        TextView tv_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.name_cardview);
            imageView=itemView.findViewById(R.id.name_image);
            tv_name=itemView.findViewById(R.id.tv_name);

        }
    }
}
