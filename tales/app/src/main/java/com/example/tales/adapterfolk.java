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

public class adapterfolk extends RecyclerView.Adapter {
    ArrayList<folktitle> myArray;
    Context c3 ;

    public adapterfolk(ArrayList<folktitle> myArray, Context c3) {
        this.myArray = myArray;
        this.c3 = c3;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.designfolk,parent,false);
        adapterfolk.ViewHolder vh3 = new adapterfolk.ViewHolder(v3);
        return vh3;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).namefolk.setText(myArray.get(position).getName());

        ((adapterfolk.ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotodetailfolk = new Intent(c3,folkdetils.class);
                gotodetailfolk.putExtra("folk",myArray.get(position));
                c3.startActivity(gotodetailfolk);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        public TextView namefolk;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            view = itemView;

            namefolk = itemView.findViewById(R.id.textView9);
        }
    }

////////
}
