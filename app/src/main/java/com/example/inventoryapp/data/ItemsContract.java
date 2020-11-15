package com.example.inventoryapp.data;

import android.provider.BaseColumns;

public class ItemsContract {
    //constructor to prevent any accidentally creation of objects from this class
    private ItemsContract(){}
    //TODO create Content_authority , Base URI and Path for connection URI

    /* Inner classes that define the tables contents */
    public static class ProductEntry implements BaseColumns{
        // Definition of table and column names of Products table
        public static final String TABLE_NAME = "Products";
        public static final String COLUMN_PRODUCT_NAME = "Name";
        public static final String COLUMN_QNTY= "Quantity";
        public static final String COLUMN_PRICE = "Price";
        public static final String COLUMN_PHOTO="Photo";
    }
    public static class Supplier implements BaseColumns{
        // Definition of table and column names of Suppliers table
        public static final String TABLE_NAME = "Suppliers";
        public static final String COLUMN_SUPPLIER_NAME = "Name";
    }
    public static class Order implements BaseColumns{
        // Definition of table and column names of ORDERS table
        public static final String TABLE_NAME = "Oreders";
        public static final String COLUMN_PRODUCT_ID = "productId";
        public static final String COLUMN_SUPPLIER_ID = "SupplierId";
        public static final String COLUMN_REQ_QUENTITY = "RequestedQnty";
    }

}
