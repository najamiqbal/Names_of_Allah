package com.softsolstudio.namesofallah.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "task_db";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        // create notes table
        db.execSQL(FavModel.CREATE_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + FavModel.TABLE_NAME);

        // Create tables again
        onCreate(db);
    }

    public long insertNote(String taskTitle,String imageName,String name) {
        // get writable database as we want to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        // `id` and `timestamp` will be inserted automatically.
        // no need to add them
        values.put(FavModel.COLUMN_TITLE, taskTitle);
        values.put(FavModel.COLUMN_IMAGE, imageName);
        values.put(FavModel.COLUMN_NAME, name);

        // insert row
        long id = db.insert(FavModel.TABLE_NAME, null, values);

        // close db connection
        db.close();

        // return newly inserted row id
        return id;
    }






    public List<FavModel> getAllNotes() {
        List<FavModel> notes = new ArrayList<>();

        // Select All Query
        String selectQuery = "SELECT  * FROM " + FavModel.TABLE_NAME + " ORDER BY " +
                FavModel.COLUMN_ID + " DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                FavModel note = new FavModel();
                note.setId(Integer.parseInt(cursor.getString(cursor.getColumnIndex(FavModel.COLUMN_ID))));
                note.setT_title(cursor.getString(cursor.getColumnIndex(FavModel.COLUMN_TITLE)));
                note.setT_image(cursor.getString(cursor.getColumnIndex(FavModel.COLUMN_IMAGE)));
                note.setT_name(cursor.getString(cursor.getColumnIndex(FavModel.COLUMN_NAME)));
                notes.add(note);
            } while (cursor.moveToNext());
        }

        // close db connection
        db.close();

        // return notes list
        return notes;
    }

    public int getNotesCount() {
        String countQuery = "SELECT  * FROM " + FavModel.TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();

        // return count
        return count;
    }

    public boolean getNotes(int counter) {
        List<FavModel> notes = new ArrayList<>();

        // Select All Query
        String selectQuery = "SELECT  * FROM " + FavModel.TABLE_NAME + " WHERE " +
                FavModel.COLUMN_TITLE +" = '" + counter + "'" + " ORDER BY " +
                FavModel.COLUMN_ID + " DESC";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst())
        {
            return true;
        }else {
            return false;
        }
    }



    public void deleteNote(FavModel note) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(FavModel.TABLE_NAME, FavModel.COLUMN_ID + " = ?",
                new String[]{String.valueOf(note.getId())});
        db.close();
    }

    public void deletefav(int note) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(FavModel.TABLE_NAME, FavModel.COLUMN_TITLE + " = ?",
                new String[]{String.valueOf(note)});
        db.close();
    }

    public void deleteAll() {
        SQLiteDatabase db = this.getReadableDatabase();
        db.delete(FavModel.TABLE_NAME, null, null);
        db.close();
    }
}
