package com.example.tales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class mythdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mythdetails);
        final ImageView hand = findViewById(R.id.imageView7);

Bundle b1 = getIntent().getExtras();
legends L = (legends) b1.getSerializable("legend");

        TextView nam = findViewById(R.id.textView6);
        TextView i = findViewById(R.id.textView7);
        ImageView pic =findViewById(R.id.imageView11);

        nam.setText(L.getName());
        i.setText(L.getDesc());
pic.setImageResource(L.getImage2());















        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomyth = new Intent(mythdetails.this,myth.class);
                startActivity(gotomyth);
            }
        });
        ///////
    }
}