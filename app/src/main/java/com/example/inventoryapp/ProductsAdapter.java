package com.example.inventoryapp;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

public class ProductsAdapter extends CursorAdapter {
    /**
     * constructor
     * @param context
     * @param c the cursor from data source
     */
    public ProductsAdapter(Context context, Cursor c) {
        super(context, c,0);
    }

    /**
     * make an empty list item view with no data.
     * @param context
     * @param cursor to correct row/rows in database
     * @param parent that new view is attached to
     * @return new list item view
     */
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.items_list,parent,false);
    }

    /**
     * this method binds data from the cursor in the database and populate the
     * item list using them.
     * @param view the view returned from newView() method
     * @param context
     * @param cursor
     */
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
//TODO initilialize the list item objects with correct data extracted from cursot
        // get the column by using cursor.getString(cursor.getcolumnIndexorthrow(column))
    }
}
