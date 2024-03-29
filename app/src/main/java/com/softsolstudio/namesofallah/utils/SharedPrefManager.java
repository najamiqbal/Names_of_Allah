package com.softsolstudio.namesofallah.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SharedPrefManager {
    private static SharedPrefManager mInstance;
    private static Context mCtx;

    private static final String SHARED_PREF_NAME = "mysharedpref12";
    private static final String KEY_USER = "Day";
    private static final String KEY_WEHE = "wehe";
    private static final String KEY_EVENING = "evening";
    private static final String KEY_WORK_DAYS = "workdays";
    private static final String KEY_WORK_FIRST_ROUND = "firstround";
    private static final String KEY_WORK_SECOND_ROUND = "secondround";
    private static final String KEY_WORK_THIRD_ROUND = "thirdround";
    private static final String KEY_WORK_FOURTH_ROUND = "fourthround";
    private static final String KEY_WORK_FIFTH_ROUND = "fifthround";
    private static final String KEY_WORK_SIX_ROUND = "sixthround";
    private static final String KEY_WORK_SEVENTH_ROUND = "seventhround";
    private static final String KEY_WORK_EIGHT_ROUND = "eightround";
    private static final String KEY_WORK_NINE_ROUND = "eightround";
    private SharedPrefManager(Context context) {
        mCtx = context;

    }

    public static synchronized SharedPrefManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPrefManager(context);
        }
        return mInstance;
    }
    public boolean addDaysToPref(ArrayList<NamesModel> daysModel) {

        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(daysModel);
        editor.putString(KEY_USER, json);
        editor.apply();
        // savePersonId(studentModel.getPerson_id());
        return true;
    }

    public List<NamesModel> getdays() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        Gson gson = new Gson();
        List<NamesModel> productFromShared = new ArrayList<>();
        String json = sharedPreferences.getString(KEY_USER, "");
        Type type = new TypeToken<List<NamesModel>>() {}.getType();
        productFromShared = gson.fromJson(json, type);
        // DaysModel obj = gson.fromJson(json, DaysModel.class);
        return productFromShared;
    }

    public boolean RemoveDays() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(KEY_USER);
        editor.apply();
        return true;
    }

    public boolean logOut() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        return true;
    }



    public boolean RemoveWprkoutDays() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(KEY_WORK_DAYS);
        editor.apply();
        return true;
    }
}