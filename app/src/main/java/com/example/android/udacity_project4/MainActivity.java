package com.example.android.udacity_project4;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.CoordinatorLayout;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // To cater music PLAY MUSIC Activity
        ImageButton musicPlay = (ImageButton) findViewById(R.id.music_play);
        musicPlay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Show Snackbar with ICON
                Snackbar snackbar = Snackbar.make(view, "Play music", Snackbar.LENGTH_LONG);
                View snackbar_view = snackbar.getView();

                TextView snackbar_text = (TextView) snackbar_view.findViewById(android.support.design.R.id.snackbar_text);
                snackbar_text.setCompoundDrawablesWithIntrinsicBounds(0,0,android.R.drawable.ic_media_play,0);
                snackbar_text.setGravity(Gravity.LEFT);
                snackbar.show();
            }
        });

        // To cater music LIST Activity
        ImageButton musicList = (ImageButton) findViewById(R.id.music_list);
        musicList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(MainActivity.this, ListActivity.class);
                Toast.makeText(view.getContext(), "Music List", Toast.LENGTH_SHORT).show();
                startActivity(listIntent);
            }
        });

        // To cater music STORE Activity
        ImageButton musicStore = (ImageButton) findViewById(R.id.music_store);
        musicStore.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(MainActivity.this, StoreActivity.class);
                Toast.makeText(view.getContext(), "Buy your music", Toast.LENGTH_SHORT).show();
                startActivity(storeIntent);
            }
        });

        // To cater music SEARCH Activity
        ImageButton musicSearch = (ImageButton) findViewById(R.id.music_search);
        musicSearch.setOnClickListener(new View.OnClickListener() {
            //
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                Toast.makeText(view.getContext(), "Search your favorite music", Toast.LENGTH_SHORT).show();
                startActivity(searchIntent);
            }
        });
    }
}
