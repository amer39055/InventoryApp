package com.example.inventoryapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.inventoryapp.data.ProductDbHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {
// here the start point of the app where a list of items will be shown up once the app starts
//Unique ID For Loader
    private static final int LOADER_ID=1;
    private ProductDbHelper mDbhelper;
    private ProductsAdapter mCursorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // floating button initilizing
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);

            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,EditActivity.class);
                    startActivity(intent);
                }
            });

        //initilaizing list view
        ListView productsList = (ListView)findViewById(R.id.ProductList);
        //if list view is empty show empty view instead
        ImageView emptyView=(ImageView)findViewById(R.id.imgNoItems) ;
        productsList.setEmptyView(emptyView);
    }
    @NonNull
    @Override
    public Loader<Cursor> onCreateLoader(int id, @Nullable Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<Cursor> loader) {

    }
}