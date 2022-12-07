package com.example.cardviewproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView txt1;
    ImageView img1;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        txt1 =itemView.findViewById(R.id.text1);
        img1=itemView.findViewById(R.id.img1);

    }
}
