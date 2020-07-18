package com.example.tales;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

import java.util.ArrayList;

public class adaptermovie extends RecyclerView.Adapter{
    ArrayList<recmovie> Myarray;
    Context c2 ;
    private String[] place_gudie;

    public adaptermovie(ArrayList<recmovie> Myarray , Context c2) {
       this.Myarray = Myarray;
        this.c2 = c2;

    }

//

/*
    public adaptermovie(ArrayList<recmovie> myarray, Context c2, String[] place_gudie) {
        Myarray = myarray;
        this.c2 = c2;
        this.place_gudie = place_gudie;
    }*/

    //
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.designmovie,parent,false);
        adaptermovie.ViewHolder vh2 = new adaptermovie.ViewHolder(v2);
        return vh2;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {
        ((adaptermovie.ViewHolder)holder).img1.setImageResource(Myarray.get(position).getPoster());
        ((ViewHolder)holder).namemovie.setText(Myarray.get(position).getName());


        ((adaptermovie.ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomoviemore = new Intent(c2, movieM.class);
                gotomoviemore.putExtra("M", Myarray.get(position));
                c2.startActivity(gotomoviemore);
            }
        });



///////


    }

    @Override
    public int getItemCount() {
        return Myarray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img1;
        public TextView namemovie;
        public View view;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            view = itemView;
            img1 = itemView.findViewById(R.id.imageView13);
            namemovie = itemView.findViewById(R.id.textView14);
        }
    }

    /////
}
