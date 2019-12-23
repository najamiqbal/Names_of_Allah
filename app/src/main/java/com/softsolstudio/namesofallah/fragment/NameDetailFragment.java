package com.softsolstudio.namesofallah.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.softsolstudio.namesofallah.R;
import com.softsolstudio.namesofallah.utils.DatabaseHelper;
import com.softsolstudio.namesofallah.utils.NamesModel;
import com.softsolstudio.namesofallah.utils.SharedPrefManager;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class NameDetailFragment extends Fragment implements View.OnClickListener {
    View view;
    ImageView imageView;
    Bundle bundle;
    ArrayList<NamesModel> NamesList;
    String imageName = "";
    int Counter;
    Boolean fav;
    int resID1;
    private MediaPlayer mMediaPlayer;
    DatabaseHelper db;
    ImageButton btn_fav, btn_share, btn_play;
    TextView tv_next, tv_previous, tv_name, tv_u_meaning, tv_u_detail, tv_e_meaning, tv_e_detail;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.name_detail_fragment, container, false);
        if (getArguments() != null) {
            Counter = Integer.parseInt(getArguments().getString("desc"));
        } else {
            Toast.makeText(getActivity(), "Basic info not save", Toast.LENGTH_SHORT).show();
        }
        init();
        next_data(Counter);
        return view;
    }

    private void init() {
        db = new DatabaseHelper(getContext());
        imageView = view.findViewById(R.id.iv_name_image);
        btn_fav = view.findViewById(R.id.fav_btn);
        btn_play = view.findViewById(R.id.play_btn);
        btn_share = view.findViewById(R.id.share_btn);
        tv_e_detail = view.findViewById(R.id.tv_e_detail);
        tv_e_meaning = view.findViewById(R.id.tv_e_meaning);
        tv_name = view.findViewById(R.id.tv_name);
        tv_u_detail = view.findViewById(R.id.tv_u_detail);
        tv_u_meaning = view.findViewById(R.id.tv_u_meaning);
        tv_next = view.findViewById(R.id.tv_next);
        tv_previous = view.findViewById(R.id.tv_previous);
        tv_next.setOnClickListener(this);
        tv_previous.setOnClickListener(this);
        btn_share.setOnClickListener(this);
        btn_fav.setOnClickListener(this);
        btn_play.setOnClickListener(this);
        NamesList = new ArrayList<>();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_next:
                Counter = Counter + 1;
                next_data(Counter);
                break;
            case R.id.tv_previous:
                if (Counter > 0) {
                    Counter = Counter - 1;
                    next_data(Counter);
                }
                break;
            case R.id.share_btn:
                String Subject = tv_name.getText() + "\n" + tv_u_meaning.getText() + "\n\n" + tv_u_detail.getText() + " \n \n" + tv_e_meaning.getText() + " \n" + tv_e_detail.getText();
                shareText("Names Of Allah", Subject);
                break;
            case R.id.fav_btn:
                if (fav) {

                    btn_fav.setImageResource(R.drawable.ic_favorite_black_24dp);
                    db.deletefav(Counter);
                    fav = false;
                    //Toast.makeText(getContext(), "true", Toast.LENGTH_SHORT).show();
                } else {
                    btn_fav.setImageResource(R.drawable.ic_favorite_red);
                    AddToFav();
                    fav = true;
                    //Toast.makeText(getContext(), "False", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.play_btn:
                playVoice(Counter);
                break;
        }
    }

    private void playVoice(int counter) {
        switch (counter) {
            case 0:
                resID1 = getResources().getIdentifier("a_1", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 1:
                resID1 = getResources().getIdentifier("a_2", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 2:
                resID1 = getResources().getIdentifier("a_3", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 3:
                resID1 = getResources().getIdentifier("a_4", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 4:
                resID1 = getResources().getIdentifier("a_5", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 5:
                resID1 = getResources().getIdentifier("a_6", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 6:
                resID1 = getResources().getIdentifier("a_7", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 7:
                resID1 = getResources().getIdentifier("a_8", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 8:
                resID1 = getResources().getIdentifier("a_9", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 9:
                resID1 = getResources().getIdentifier("a_10", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 10:
                resID1 = getResources().getIdentifier("a_11", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 11:
                resID1 = getResources().getIdentifier("a_12", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 12:
                resID1 = getResources().getIdentifier("a_13", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 13:
                resID1 = getResources().getIdentifier("a_14", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 14:
                resID1 = getResources().getIdentifier("a_15", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 15:
                resID1 = getResources().getIdentifier("a_16", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 16:
                resID1 = getResources().getIdentifier("a_17", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 17:
                resID1 = getResources().getIdentifier("a_18", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 18:
                resID1 = getResources().getIdentifier("a_19", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 19:
                resID1 = getResources().getIdentifier("a_20", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 20:
                resID1 = getResources().getIdentifier("a_21", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 21:
                resID1 = getResources().getIdentifier("a_22", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 22:
                resID1 = getResources().getIdentifier("a_23", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 23:
                resID1 = getResources().getIdentifier("a_24", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 24:
                resID1 = getResources().getIdentifier("a_25", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 25:
                resID1 = getResources().getIdentifier("a_26", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 26:
                resID1 = getResources().getIdentifier("a_27", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 27:
                resID1 = getResources().getIdentifier("a_28", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 28:
                resID1 = getResources().getIdentifier("a_29", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 29:
                resID1 = getResources().getIdentifier("a_30", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 30:
                resID1 = getResources().getIdentifier("a_31", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 31:
                resID1 = getResources().getIdentifier("a_32", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 32:
                resID1 = getResources().getIdentifier("a_33", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 33:
                resID1 = getResources().getIdentifier("a_34", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 34:
                resID1 = getResources().getIdentifier("a_35", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 35:
                resID1 = getResources().getIdentifier("a_36", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 36:
                resID1 = getResources().getIdentifier("a_37", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 37:
                resID1 = getResources().getIdentifier("a_38", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 38:
                resID1 = getResources().getIdentifier("a_39", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 39:
                resID1 = getResources().getIdentifier("a_40", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 40:
                resID1 = getResources().getIdentifier("a_41", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 41:
                resID1 = getResources().getIdentifier("a_42", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 42:
                resID1 = getResources().getIdentifier("a_43", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 43:
                resID1 = getResources().getIdentifier("a_44", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 44:
                resID1 = getResources().getIdentifier("a_45", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 45:
                resID1 = getResources().getIdentifier("a_46", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 46:
                resID1 = getResources().getIdentifier("a_47", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 47:
                resID1 = getResources().getIdentifier("a_48", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 48:
                resID1 = getResources().getIdentifier("a_49", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 49:
                resID1 = getResources().getIdentifier("a_50", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 50:
                resID1 = getResources().getIdentifier("a_51", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 51:
                resID1 = getResources().getIdentifier("a_52", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 52:
                resID1 = getResources().getIdentifier("a_53", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 53:
                resID1 = getResources().getIdentifier("a_54", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 54:
                resID1 = getResources().getIdentifier("a_55", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 55:
                resID1 = getResources().getIdentifier("a_56", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 56:
                resID1 = getResources().getIdentifier("a_57", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 57:
                resID1 = getResources().getIdentifier("a_58", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 58:
                resID1 = getResources().getIdentifier("a_59", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 59:
                resID1 = getResources().getIdentifier("a_60", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 60:
                resID1 = getResources().getIdentifier("a_61", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 61:
                resID1 = getResources().getIdentifier("a_62", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 62:
                resID1 = getResources().getIdentifier("a_63", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 63:
                resID1 = getResources().getIdentifier("a_64", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 64:
                resID1 = getResources().getIdentifier("a_65", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 65:
                resID1 = getResources().getIdentifier("a_66", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 66:
                resID1 = getResources().getIdentifier("a_68", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 67:
                resID1 = getResources().getIdentifier("a_68", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 68:
                resID1 = getResources().getIdentifier("a_69", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 69:
                resID1 = getResources().getIdentifier("a_70", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 70:
                resID1 = getResources().getIdentifier("a_71", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 71:
                resID1 = getResources().getIdentifier("a_72", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 72:
                resID1 = getResources().getIdentifier("a_73", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 73:
                resID1 = getResources().getIdentifier("a_74", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 74:
                resID1 = getResources().getIdentifier("a_75", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 75:
                resID1 = getResources().getIdentifier("a_76", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 76:
                resID1 = getResources().getIdentifier("a_77", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 77:
                resID1 = getResources().getIdentifier("a_78", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 78:
                resID1 = getResources().getIdentifier("a_79", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 79:
                resID1 = getResources().getIdentifier("a_80", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 80:
                resID1 = getResources().getIdentifier("a_81", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 81:
                resID1 = getResources().getIdentifier("a_82", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 82:
                resID1 = getResources().getIdentifier("a_83", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 83:
                resID1 = getResources().getIdentifier("a_84", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 84:
                resID1 = getResources().getIdentifier("a_85", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 85:
                resID1 = getResources().getIdentifier("a_86", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 86:
                resID1 = getResources().getIdentifier("a_87", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 87:
                resID1 = getResources().getIdentifier("a_88", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 88:
                resID1 = getResources().getIdentifier("a_89", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 89:
                resID1 = getResources().getIdentifier("a_90", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 90:
                resID1 = getResources().getIdentifier("a_91", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 91:
                resID1 = getResources().getIdentifier("a_92", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 92:
                resID1 = getResources().getIdentifier("a_93", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 93:
                resID1 = getResources().getIdentifier("a_94", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 94:
                resID1 = getResources().getIdentifier("a_95", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 95:
                resID1 = getResources().getIdentifier("a_96", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 96:
                resID1 = getResources().getIdentifier("a_97", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 97:
                resID1 = getResources().getIdentifier("a_98", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 98:
                resID1 = getResources().getIdentifier("a_99", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
            case 99:
                resID1 = getResources().getIdentifier("a_100", "raw", getContext().getPackageName());
                play(getContext(), resID1);
                break;
        }
    }

    public void play(Context context, int rid) {
        stop();

        mMediaPlayer = MediaPlayer.create(context, rid);
        mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                stop();
            }
        });

        mMediaPlayer.start();
    }

    public void stop() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    private void AddToFav() {
        long id = db.insertNote(String.valueOf(Counter), imageName, tv_name.getText().toString());
        if (id != 0) {
            Log.d("id is", "this the alarm id" + id);
            Toast.makeText(getContext(), "Add to favourite", Toast.LENGTH_SHORT).show();
        }
    }

    public void shareText(String subject, String body) {
        Intent txtIntent = new Intent(android.content.Intent.ACTION_SEND);
        txtIntent.setType("text/plain");
        txtIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
        txtIntent.putExtra(android.content.Intent.EXTRA_TEXT, body);
        startActivity(Intent.createChooser(txtIntent, "Share"));
    }

    public void next_data(int counter) {
        String json;
        try {

            //Log.d("SINGLE","PATH"+path);
            InputStream is = getContext().getAssets().open("names.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
            JSONArray jsonArray = new JSONArray(json);
            //Total=jsonArray.length();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                if (jsonObject.getString("id").equals(String.valueOf(counter))) {
                    tv_name.setText(jsonObject.getString("name"));
                    tv_u_meaning.setText(jsonObject.getString("murdu"));
                    tv_u_detail.setText(jsonObject.getString("udetail"));
                    tv_e_meaning.setText(jsonObject.getString("meng"));
                    tv_e_detail.setText(jsonObject.getString("edetail"));
                    int id = getContext().getResources().getIdentifier(jsonObject.getString("image"), "drawable", getContext().getPackageName());
                    imageView.setImageResource(id);
                    imageName = jsonObject.getString("image");
                    fav = db.getNotes(Counter);
                    if (fav) {
                        btn_fav.setImageResource(R.drawable.ic_favorite_red);
                        //Toast.makeText(getContext(), "true", Toast.LENGTH_SHORT).show();
                    } else {
                        btn_fav.setImageResource(R.drawable.ic_favorite_black_24dp);
                        //Toast.makeText(getContext(), "False", Toast.LENGTH_SHORT).show();
                    }
                    //Log.d("Count", String.valueOf(w_title));
                }
                // groupList.add(jsonObject.getString("name"));
                //count++;
                //Log.d("Count", String.valueOf(count));
            }


            //Toast.makeText(GroupList.this,grouplist.toString(), Toast.LENGTH_SHORT).show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
