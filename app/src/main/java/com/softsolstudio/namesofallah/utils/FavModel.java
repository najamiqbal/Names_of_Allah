package com.softsolstudio.namesofallah.utils;

public class FavModel {
    public static final String TABLE_NAME = "tasktable";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_IMAGE = "image";
    public static final String COLUMN_NAME = "name";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getT_title() {
        return t_title;
    }

    public void setT_title(String t_title) {
        this.t_title = t_title;
    }

    private int id;
    private String t_title;

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    private String t_name;

    public String getT_image() {
        return t_image;
    }

    public void setT_image(String t_image) {
        this.t_image = t_image;
    }

    private String t_image;

    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_TITLE + " TEXT,"
                    + COLUMN_IMAGE + " TEXT,"
                    + COLUMN_NAME + " TEXT"
                    + ")";

    public FavModel() {
    }

    public FavModel(int id, String stitle,String t_image,String t_name) {
        this.id=id;
        this.t_title=stitle;
        this.t_image=t_image;
        this.t_name=t_name;
    }




}
