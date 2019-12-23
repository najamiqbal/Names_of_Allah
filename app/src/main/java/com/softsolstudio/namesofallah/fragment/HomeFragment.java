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
import androidx.recyclerview.widget.RecyclerView;

import com.softsolstudio.namesofallah.R;
import com.softsolstudio.namesofallah.adapters.NamesListAdapter;
import com.softsolstudio.namesofallah.utils.NamesModel;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class HomeFragment extends Fragment {
    View view;
    RecyclerView recycler;
    ArrayList<NamesModel> NamesList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.home_fragment,container,false);
        initialization();
        get_data();
        return view;
    }

    public void get_data() {
        String json;
        try {

            InputStream is=getContext().getAssets().open("names.json");
            int size=is.available();
            byte[] buffer=new byte[size];
            is.read(buffer);
            is.close();

            json =new String(buffer,"UTF-8");
            JSONArray jsonArray=new JSONArray(json);

            for (int i = 0; i<jsonArray.length(); i++ ){
                JSONObject jsonObject=jsonArray.getJSONObject(i);


                NamesModel model=new NamesModel();
                model.setName(jsonObject.getString("name"));
                model.setM_eng(jsonObject.getString("meng"));
                model.setM_urdu(jsonObject.getString("murdu"));
                model.setDetail_eng(jsonObject.getString("edetail"));
                model.setDetail_urdu(jsonObject.getString("udetail"));
                model.setAudio(jsonObject.getString("audio"));
                model.setId(jsonObject.getString("id"));
                model.setImage(jsonObject.getString("image"));
                model.setFav(jsonObject.getString("fav"));
                NamesList.add(model);
                // groupList.add(jsonObject.getString("name"));
                //count++;
                //Log.d("Count", String.valueOf(count));
            }

            NamesListAdapter ListAdapter=new NamesListAdapter(getContext(),NamesList);
            recycler.setAdapter(ListAdapter);
            //Toast.makeText(GroupList.this,grouplist.toString(), Toast.LENGTH_SHORT).show();


        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(getContext(), "OHO", Toast.LENGTH_SHORT).show();
        }
    }

    private void initialization() {
        recycler = view.findViewById(R.id.names_recycler_view);
        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MealPlan.this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),3);
        recycler.setLayoutManager(gridLayoutManager);
        recycler.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        NamesList = new ArrayList<>();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
