package com.example.a300254326.nikhil_300254326_bingo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by 300254326 on 8/14/2017.
 */

public class MyDB extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "winners.db";

    public static final String query = "CREATE TABLE " +
            Entry.table + " (" +
            Entry._ID + " INTEGER PRIMARY KEY, " +
            Entry.col1 + " TEXT, " +
            Entry.col2 + " INTEGER )";

    public MyDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("MyDB", "Constructor");
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(query);
        Log.d("MyDB", "onCreate");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(query);
        Log.d("MyDB", "onUpgrade");
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d("MyDB", "onDowngrade");
        onUpgrade(db, oldVersion, newVersion);
    }
}

