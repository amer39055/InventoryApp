package com.example.inventoryapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ProductDbHelper extends SQLiteOpenHelper {
            // TODO set connection to database and all table creation

    // database version and name
    private static final String DATABASE_NAME = "inventoryDb.db";
    private static final int DB_VERSION =1;
    // For all Primary Keys _id should be used as column name
    public static final String COLUMN_ID = "_id";









    public ProductDbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
