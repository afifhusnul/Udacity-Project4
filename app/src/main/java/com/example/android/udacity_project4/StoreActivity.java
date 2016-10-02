package com.example.android.udacity_project4;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        // Change action bar color base on Activity main menu
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#8800A0")));
    }
}
