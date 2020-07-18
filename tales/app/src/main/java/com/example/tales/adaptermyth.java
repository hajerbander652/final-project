package com.example.tales;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adaptermyth extends RecyclerView.Adapter {
    ArrayList<legends> myarray;
    Context c1 ;

    public adaptermyth(ArrayList<legends> myarray, Context c1) {
        this.myarray = myarray;
        this.c1 = c1;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.legends,parent,false);
        ViewHolder vh1 = new ViewHolder(v1);
        return vh1;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        ((ViewHolder)holder).img.setImageResource(myarray.get(position).getImage());
        ((ViewHolder)holder).mythname.setText(myarray.get(position).getName());


        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotodetailsmyth = new Intent(c1,mythdetails.class);
                gotodetailsmyth.putExtra("legend",myarray.get(position));
                c1.startActivity(gotodetailsmyth);
            }
        });


    }

    @Override
    public int getItemCount() {
        return myarray.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;
        public TextView mythname;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            view = itemView;
            img = itemView.findViewById(R.id.imageView10);
           mythname = itemView.findViewById(R.id.textView5);
        }
    }


    //////////
}
