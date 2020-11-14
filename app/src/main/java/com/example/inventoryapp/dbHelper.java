package com.example.inventoryapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbHelper extends SQLiteOpenHelper {
            // TODO set connection to database and all table creation

    // database version and name
    private static final String DATABASE_NAME = "inventoryDb.db";
    private static final int DB_VERSION =1;
    // For all Primary Keys _id should be used as column name
    public static final String COLUMN_ID = "_id";

    // Definition of table and column names of Products table
    public static final String TABLE_PRODUCTS = "Products";
    public static final String COLUMN_PRODUCT_NAME = "Name";
    public static final String COLUMN_QNTY= "Quantity";
    public static final String COLUMN_PRICE = "Price";

    // Definition of table and column names of Suppliers table
    public static final String TABLE_SUPPLIERS = "Suppliers";
    public static final String COLUMN_SUPPLIER_NAME = "Name";

    // Definition of table and column names of ORDERS table
    public static final String TABLE_ORDER = "Oreders";
    public static final String COLUMN_PRODUCT_ID = "productId";
    public static final String COLUMN_SUPPLIER_ID = "SupplierId";
    public static final String COLUMN_REQ_QUENTITY = "RequestedQnty";



    public dbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
