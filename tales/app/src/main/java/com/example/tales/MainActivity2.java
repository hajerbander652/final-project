package com.example.tales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageView hand = findViewById(R.id.imageView3);
        final ImageView goldenpin = findViewById(R.id.imageView5);
        final TextView myths = findViewById(R.id.textView3);
        final TextView folks = findViewById(R.id.textView4);
//////
final MediaPlayer pagess = MediaPlayer.create(this,R.raw.pagess);




        folks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotofolk = new Intent(MainActivity2.this,folk.class);
                startActivity(gotofolk);
            }
        });


///////
        myths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomyth = new Intent(MainActivity2.this,myth.class);
                startActivity(gotomyth);
            }
        });
//////


        goldenpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagess.start();
                Intent gotopage2 = new Intent(MainActivity2.this,bookpage2.class);
                startActivity(gotopage2);
            }
        });

        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoflyingbook = new Intent(MainActivity2.this,flyingbook.class);
                startActivity(gotoflyingbook);
            }
        });



        /////
    }
}