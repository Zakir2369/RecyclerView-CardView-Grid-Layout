package com.example.cardviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    String[] cityNames;
    int[] flags;
    Context con;

    public MyAdapter( Context con,String[] cityNames, int[] flags) {
        this.cityNames = cityNames;
        this.flags = flags;
        this.con = con;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(con).inflate(R.layout.child_layout,parent,false);
        MyViewHolder VH = new MyViewHolder(v);
        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.txt1.setText(cityNames[position]);
        holder.img1.setImageResource(flags[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(con,cityNames[position],Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cityNames.length;
    }
}
