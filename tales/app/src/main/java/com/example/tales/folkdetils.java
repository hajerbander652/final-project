package com.example.tales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class folkdetils extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folkdetils);


        Bundle b2 = getIntent().getExtras();
        folktitle f  = (folktitle) b2.getSerializable("folk");

        TextView nam = findViewById(R.id.textView11);
        TextView i = findViewById(R.id.textView12);
        TextView ww = findViewById(R.id.textView10);
nam.setText(f.getName());
i.setText(f.getInfo());
ww.setText(f.getWhere());



final ImageView hand = findViewById(R.id.imageView7);

        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotofolk= new Intent(folkdetils.this,folk.class);
                startActivity(gotofolk);
            }
        });
        ///
    }
}