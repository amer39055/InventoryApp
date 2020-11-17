package com.example.inventoryapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.inventoryapp.data.ItemsContract;
import androidx.annotation.Nullable;


public class ProductDbHelper extends SQLiteOpenHelper {


    // database version and name
    private static final String DATABASE_NAME = "inventoryDb.db";
    private static final int DB_VERSION =1;

    /**
     * Product Table CREATE Statement
     */
    private static final  String  SQL_CREATE_PRODUCTS_TABLE = "CREATE TABLE "+ ItemsContract.ProductEntry.TABLE_NAME + "( "
            + ItemsContract.ProductEntry._ID +"INTEGER PRIMARY KEY,"
            + ItemsContract.ProductEntry.COLUMN_PRODUCT_NAME + "TEXT UNIQUE NOT NULL,"
            + ItemsContract.ProductEntry.COLUMN_PRICE +"REAL DEFAULT 0,"
            + ItemsContract.ProductEntry.COLUMN_QNTY + "INTEGER DEFAULT 0,"
            + ItemsContract.ProductEntry.COLUMN_PHOTO + "BLOB );";
    /**
     * Suppliers Table CREATE statement
     */
    private static final String SQL_CREATE_SUPPLIERS_TABLE = "CREATE TABLE "+ ItemsContract.SupplierEntry.TABLE_NAME +"( "
            + ItemsContract.SupplierEntry._ID +"INTEGER PRIMARY KEY,"
            + ItemsContract.SupplierEntry.COLUMN_SUPPLIER_NAME+"TEXT NOT NULL"
            +");";
    /**
     *ORDER TABLE CREATE Statement , take in consideration the foreign keys imported from Suppliers and Products' tables
     */
    private static final String SQL_CREATE_ORDERS_TABLE = "CREATE TABLE " + ItemsContract.OrderEntry.TABLE_NAME + "( " +
            ItemsContract.OrderEntry._ID + " INTEGER PRIMARY KEY," +
            ItemsContract.OrderEntry.COLUMN_REQ_QUENTITY + " INTEGER," +
            ItemsContract.OrderEntry.COLUMN_PRODUCT_ID + " INTEGER," +
            ItemsContract.OrderEntry.COLUMN_SUPPLIER_ID +"INTEGER,"+
            " FOREIGN KEY (" + ItemsContract.OrderEntry.COLUMN_PRODUCT_ID + ") REFERENCES " + ItemsContract.ProductEntry.COLUMN_PRODUCT_NAME + "(" +
            ItemsContract.ProductEntry._ID +")," +
            " FOREIGN KEY (" + ItemsContract.OrderEntry.COLUMN_SUPPLIER_ID + ") REFERENCES " + ItemsContract.SupplierEntry.TABLE_NAME+ "(" +
            ItemsContract.SupplierEntry._ID +")" + ");";

    /**
     * Constructor
     * @param context
     */
    public ProductDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null , DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       try {
           db.execSQL(SQL_CREATE_PRODUCTS_TABLE);
           db.execSQL(SQL_CREATE_SUPPLIERS_TABLE);
           db.execSQL(SQL_CREATE_ORDERS_TABLE);
       } catch(SQLiteException ex)
       {
           throw ex;
       }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
