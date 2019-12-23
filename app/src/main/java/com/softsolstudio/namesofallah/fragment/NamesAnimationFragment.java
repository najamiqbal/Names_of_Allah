package com.softsolstudio.namesofallah.fragment;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.softsolstudio.namesofallah.R;

public class NamesAnimationFragment extends AppCompatActivity {
    View view;
    ImageView imageView;
    int resID1;
    Toolbar toolbar;
    int counter=0;
    private MediaPlayer mMediaPlayer;
    Animation frombottom,fromtop;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.names_ani_fragment);
        init();
    }

    private void init() {
        toolbar = findViewById(R.id.toolbar1);
        toolbar.setTitle("99 names of Allah");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imageView=findViewById(R.id.animation_imageview);
        fromtop= AnimationUtils.loadAnimation(this,R.anim.abc_slide_in_top);
        playVoice(counter);
    }
    private void playVoice(int counter) {
        switch (counter) {
            case 0:
                imageView.setImageResource(R.drawable.a_0);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_1", "raw", this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 1:
                imageView.setImageResource(R.drawable.a_1);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_2", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.a_2);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_3", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 3:
                imageView.setImageResource(R.drawable.a_3);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_4", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 4:
                imageView.setImageResource(R.drawable.a_4);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_5", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 5:
                imageView.setImageResource(R.drawable.a_5);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_6", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 6:
                imageView.setImageResource(R.drawable.a_6);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_7", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 7:
                imageView.setImageResource(R.drawable.a_7);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_8", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 8:
                imageView.setImageResource(R.drawable.a_8);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_9", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 9:
                imageView.setImageResource(R.drawable.a_9);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_10", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 10:
                imageView.setImageResource(R.drawable.a_10);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_11", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 11:
                imageView.setImageResource(R.drawable.a_11);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_12", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 12:
                imageView.setImageResource(R.drawable.a_12);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_13", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 13:
                imageView.setImageResource(R.drawable.a_13);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_14", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 14:
                imageView.setImageResource(R.drawable.a_14);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_15", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 15:
                imageView.setImageResource(R.drawable.a_15);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_16", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 16:
                imageView.setImageResource(R.drawable.a_16);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_17", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 17:
                imageView.setImageResource(R.drawable.a_17);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_18", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 18:
                imageView.setImageResource(R.drawable.a_18);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_19", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 19:
                imageView.setImageResource(R.drawable.a_19);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_20", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 20:
                imageView.setImageResource(R.drawable.a_20);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_21", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 21:
                imageView.setImageResource(R.drawable.a_21);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_22", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 22:
                imageView.setImageResource(R.drawable.a_22);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_23", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 23:
                imageView.setImageResource(R.drawable.a_23);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_24", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 24:
                imageView.setImageResource(R.drawable.a_24);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_25", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 25:
                imageView.setImageResource(R.drawable.a_25);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_26", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 26:
                imageView.setImageResource(R.drawable.a_26);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_27", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 27:
                imageView.setImageResource(R.drawable.a_27);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_28", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 28:
                imageView.setImageResource(R.drawable.a_28);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_29", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 29:
                imageView.setImageResource(R.drawable.a_29);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_30", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 30:
                imageView.setImageResource(R.drawable.a_30);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_31", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 31:
                imageView.setImageResource(R.drawable.a_31);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_32", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 32:
                imageView.setImageResource(R.drawable.a_32);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_33", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 33:
                imageView.setImageResource(R.drawable.a_33);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_34", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 34:
                imageView.setImageResource(R.drawable.a_34);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_35", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 35:
                imageView.setImageResource(R.drawable.a_35);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_36", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 36:
                imageView.setImageResource(R.drawable.a_36);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_37", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 37:
                imageView.setImageResource(R.drawable.a_37);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_38", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 38:
                imageView.setImageResource(R.drawable.a_38);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_39", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 39:
                imageView.setImageResource(R.drawable.a_39);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_40", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 40:
                imageView.setImageResource(R.drawable.a_40);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_41", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 41:
                imageView.setImageResource(R.drawable.a_41);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_42", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 42:
                imageView.setImageResource(R.drawable.a_42);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_43", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 43:
                imageView.setImageResource(R.drawable.a_43);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_44", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 44:
                imageView.setImageResource(R.drawable.a_44);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_45", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 45:
                imageView.setImageResource(R.drawable.a_45);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_46", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 46:
                imageView.setImageResource(R.drawable.a_46);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_47", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 47:
                imageView.setImageResource(R.drawable.a_47);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_48", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 48:
                imageView.setImageResource(R.drawable.a_48);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_49", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 49:
                imageView.setImageResource(R.drawable.a_49);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_50", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 50:
                imageView.setImageResource(R.drawable.a_50);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_51", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 51:
                imageView.setImageResource(R.drawable.a_51);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_52", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 52:
                imageView.setImageResource(R.drawable.a_52);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_53", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 53:
                imageView.setImageResource(R.drawable.a_53);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_54", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 54:
                imageView.setImageResource(R.drawable.a_54);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_55", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 55:
                imageView.setImageResource(R.drawable.a_55);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_56", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 56:
                imageView.setImageResource(R.drawable.a_56);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_57", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 57:
                imageView.setImageResource(R.drawable.a_57);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_58", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 58:
                imageView.setImageResource(R.drawable.a_58);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_59", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 59:
                imageView.setImageResource(R.drawable.a_59);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_60", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 60:
                imageView.setImageResource(R.drawable.a_60);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_61", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 61:
                imageView.setImageResource(R.drawable.a_61);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_62", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 62:
                imageView.setImageResource(R.drawable.a_62);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_63", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 63:
                imageView.setImageResource(R.drawable.a_63);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_64", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 64:
                imageView.setImageResource(R.drawable.a_64);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_65", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 65:
                imageView.setImageResource(R.drawable.a_65);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_66", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 66:
                imageView.setImageResource(R.drawable.a_66);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_68", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 67:
                imageView.setImageResource(R.drawable.a_67);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_68", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 68:
                imageView.setImageResource(R.drawable.a_68);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_69", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 69:
                imageView.setImageResource(R.drawable.a_69);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_70", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 70:
                imageView.setImageResource(R.drawable.a_70);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_71", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 71:
                imageView.setImageResource(R.drawable.a_71);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_72", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 72:
                imageView.setImageResource(R.drawable.a_72);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_73", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 73:
                imageView.setImageResource(R.drawable.a_73);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_74", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 74:
                imageView.setImageResource(R.drawable.a_74);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_75", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 75:
                imageView.setImageResource(R.drawable.a_75);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_76", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 76:
                imageView.setImageResource(R.drawable.a_76);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_77", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 77:
                imageView.setImageResource(R.drawable.a_77);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_78", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 78:
                imageView.setImageResource(R.drawable.a_78);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_79", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 79:
                imageView.setImageResource(R.drawable.a_79);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_80", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 80:
                imageView.setImageResource(R.drawable.a_80);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_81", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 81:
                imageView.setImageResource(R.drawable.a_81);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_82", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 82:
                imageView.setImageResource(R.drawable.a_82);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_83", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 83:
                imageView.setImageResource(R.drawable.a_83);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_84", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 84:
                imageView.setImageResource(R.drawable.a_84);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_85", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 85:
                imageView.setImageResource(R.drawable.a_85);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_86", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 86:
                imageView.setImageResource(R.drawable.a_86);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_87", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 87:
                imageView.setImageResource(R.drawable.a_87);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_88", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 88:
                imageView.setImageResource(R.drawable.a_88);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_89", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 89:
                imageView.setImageResource(R.drawable.a_89);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_90", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 90:
                imageView.setImageResource(R.drawable.a_90);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_91", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 91:
                imageView.setImageResource(R.drawable.a_91);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_92", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 92:
                imageView.setImageResource(R.drawable.a_92);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_93", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 93:
                imageView.setImageResource(R.drawable.a_93);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_94", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 94:
                imageView.setImageResource(R.drawable.a_94);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_95", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 95:
                imageView.setImageResource(R.drawable.a_95);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_96", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 96:
                imageView.setImageResource(R.drawable.a_96);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_97", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 97:
                imageView.setImageResource(R.drawable.a_97);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_98", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 98:
                imageView.setImageResource(R.drawable.a_98);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_99", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
                break;
            case 99:
                imageView.setImageResource(R.drawable.a_99);
                imageView.setAnimation(fromtop);
                resID1 = getResources().getIdentifier("a_100", "raw", NamesAnimationFragment.this.getPackageName());
                play(NamesAnimationFragment.this, resID1);
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
                counter=counter+1;
                if (counter<100){
                    playVoice(counter);
                }
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //menu item selected
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stop();

    }
}
