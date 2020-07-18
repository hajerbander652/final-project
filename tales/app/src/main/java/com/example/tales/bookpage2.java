package com.example.tales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class bookpage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookpage2);
        final ImageView goldenpin = findViewById(R.id.imageView5);
        final TextView movies = findViewById(R.id.textView8);
        final MediaPlayer pagess = MediaPlayer.create(this,R.raw.pagess);



        goldenpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagess.start();
                Intent gotomain2 = new Intent(bookpage2.this,MainActivity2.class);
                startActivity(gotomain2);
            }
        });

        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomovie = new Intent(bookpage2.this,movie.class);
                startActivity(gotomovie);
            }
        });


        /////
    }
}