package com.example.tales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       final ImageView contacttext =findViewById(R.id.imageView);

        final TextView followme  = findViewById(R.id.textView);

        ///
        contacttext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotocontact = new Intent(MainActivity.this,contact.class);
                startActivity(gotocontact);

            }
        });
////

followme.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent gotoflyingbook = new Intent(MainActivity.this,flyingbook.class);
        startActivity(gotoflyingbook);
    }
});






      /////////
    }
}