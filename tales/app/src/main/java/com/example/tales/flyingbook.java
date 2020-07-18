package com.example.tales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class flyingbook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyingbook);

        final Button movingbook = findViewById(R.id.button2);
        final Animation anims;
        final ImageView hand = findViewById(R.id.imageView4);

        anims = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        movingbook.startAnimation(anims);


movingbook.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent gotoMainActivity2 = new Intent(flyingbook.this,MainActivity2.class);
        startActivity(gotoMainActivity2);
    }
});


        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomain1 = new Intent(flyingbook.this,MainActivity.class);
                startActivity(gotomain1);
            }
        });

        //////////
    }
}