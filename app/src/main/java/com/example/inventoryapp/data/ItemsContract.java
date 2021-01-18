package com.example.inventoryapp.data;

import android.net.Uri;
import android.provider.BaseColumns;

public class ItemsContract {
    //Private constructor to prevent any accidentally creation of objects from this class
    private ItemsContract(){}

    //uri for content
    public final static String CONTENT_AUTHORITY = "com.example.inventory";
    //create usable URI
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://"+CONTENT_AUTHORITY);
    //constant for each table in Products
    public static final String PATH_PRODUCTS="product";
    public static final String PATH_SUPLLIERS="supplier";
    public static final String PATH_ORDERS="order";



    /* Inner classes that define the tables contents */
    public static class ProductEntry implements BaseColumns{
        // Definition of table and column names of Products table
        public static final String TABLE_NAME = "Products";
        public static final String COLUMN_PRODUCT_NAME = "Name";
        public static final String COLUMN_QNTY= "Quantity";
        public static final String COLUMN_PRICE = "Price";
        public static final String COLUMN_PHOTO="Photo";
    }
    public static class SupplierEntry implements BaseColumns{
        // Definition of table and column names of Suppliers table
        public static final String TABLE_NAME = "Suppliers";
        public static final String COLUMN_SUPPLIER_NAME = "Name";
    }
    public static class OrderEntry implements BaseColumns{
        // Definition of table and column names of ORDERS table
        public static final String TABLE_NAME = "Oreders";
        public static final String COLUMN_PRODUCT_ID = "productId";
        public static final String COLUMN_SUPPLIER_ID = "SupplierId";
        public static final String COLUMN_REQ_QUENTITY = "RequestedQnty";
    }

}
