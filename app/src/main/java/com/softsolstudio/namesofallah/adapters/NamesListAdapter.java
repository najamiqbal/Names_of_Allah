package com.softsolstudio.namesofallah.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softsolstudio.namesofallah.R;
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
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tv_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.name_image);
            tv_name=itemView.findViewById(R.id.tv_name);

        }
    }
}
