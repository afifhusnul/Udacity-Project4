package com.example.android.udacity_project4;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        // Change action bar color base on Activity main menu
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#379237")));

        ImageButton musicDetail = (ImageButton) findViewById(R.id.play_this);
        musicDetail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent detailIntent = new Intent(ListActivity.this, ListActivity.class);
                Snackbar.make(view, "Playing your music", Snackbar.LENGTH_LONG).show();
            }
        });
    }


}
