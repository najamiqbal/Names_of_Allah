package com.softsolstudio.namesofallah.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softsolstudio.namesofallah.R;
import com.softsolstudio.namesofallah.utils.DatabaseHelper;
import com.softsolstudio.namesofallah.utils.FavModel;
import com.softsolstudio.namesofallah.utils.NamesModel;

import java.util.ArrayList;
import java.util.List;

public class FavAdapterList extends RecyclerView.Adapter<FavAdapterList.ViewHolder> {
    Context context;
    List<FavModel>list;
    DatabaseHelper db;
    public FavAdapterList(Context context, ArrayList<FavModel> namesList) {
        this.context=context;
        this.list=namesList;
        db = new DatabaseHelper(context);
    }


    @NonNull
    @Override
    public FavAdapterList.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fav_view_holder,parent,false);
        return new ViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull FavAdapterList.ViewHolder holder, final int position) {
        final FavModel Model=list.get(position);
            holder.fav_name.setText(Model.getT_name());
            int id = context.getResources().getIdentifier(Model.getT_image(), "drawable", context.getPackageName());
            holder.favImage.setImageResource(id);
            holder.fav_heart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    deleteNote(position);
                }
            });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView favImage;
        TextView fav_name,fav_heart;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fav_heart=itemView.findViewById(R.id.redfav_tv);
            fav_name=itemView.findViewById(R.id.tv_displaynamefav);
            favImage=itemView.findViewById(R.id.fav_image);
        }
    }
    private void deleteNote(int position) {
        // deleting the note from db
        Log.d("position is", "check this" + list.get(position));
        db.deleteNote(list.get(position));

        // removing the note from the list
        list.remove(position);
        notifyItemRemoved(position);
    }
}
