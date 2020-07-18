package com.example.tales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class movieM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_m);
        final ImageView hand = findViewById(R.id.imageView14);


        Bundle b2 = getIntent().getExtras();
        final recmovie m = (recmovie) b2.getSerializable("M");

        TextView nam = findViewById(R.id.textView15);
        TextView i = findViewById(R.id.textView16);
        ImageView pic =findViewById(R.id.imageView9);
        final TextView u = findViewById(R.id.textView17);

        nam.setText(m.getName());
        i.setText(m.getInf());
        pic.setImageResource(m.getPoster());









u.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent youtube = new Intent(Intent.ACTION_VIEW,Uri.parse(m.getUrl()));

        startActivity(youtube);
    }
});





















        hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomovie = new Intent(movieM.this,movie.class);
                startActivity(gotomovie);
            }
        });
        //////
    }
}