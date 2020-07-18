package com.example.tales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        final ImageView hand = findViewById(R.id.imageView2);
        final TextView email = findViewById(R.id.textView2);

        ////
        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backmain1 = new Intent(contact.this,MainActivity.class);
                startActivity(backmain1);
            }
        });
        ////

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callemail = new Intent(Intent.ACTION_SEND);
                callemail.setType("text/plain");
                startActivity(callemail);
            }
        });




     /////
    }
}