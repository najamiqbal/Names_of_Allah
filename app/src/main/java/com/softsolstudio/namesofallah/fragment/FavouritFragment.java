package com.softsolstudio.namesofallah.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.softsolstudio.namesofallah.R;
import com.softsolstudio.namesofallah.adapters.FavAdapterList;
import com.softsolstudio.namesofallah.adapters.NamesListAdapter;
import com.softsolstudio.namesofallah.utils.DatabaseHelper;
import com.softsolstudio.namesofallah.utils.FavModel;
import com.softsolstudio.namesofallah.utils.NamesModel;
import com.softsolstudio.namesofallah.utils.SharedPrefManager;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FavouritFragment extends Fragment {
    View view;
    RecyclerView recycler;
    ArrayList<FavModel> NamesList;
    DatabaseHelper db;
    FavAdapterList adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fav_fragment,container,false);
        initialization();
        return view;
    }

    private void initialization() {
        db = new DatabaseHelper(getContext());
        recycler = view.findViewById(R.id.fav_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        //GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),3);
        recycler.setLayoutManager(linearLayoutManager);
        //recycler.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        NamesList = new ArrayList<>();
        NamesList.addAll(db.getAllNotes());
        if (NamesList != null) {
            adapter = new FavAdapterList(getContext(), NamesList);
            recycler.setAdapter(adapter);
            Log.d("BussList", "AvailableBuss");
        } else {
            Toast.makeText(getContext(), "No DATa", Toast.LENGTH_SHORT).show();
        }
    }

}
