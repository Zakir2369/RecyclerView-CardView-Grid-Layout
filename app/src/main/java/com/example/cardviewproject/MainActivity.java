package com.example.cardviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    String[] CityName = {"Banglades","Brazil","India","Myenmar"};
    int[] array_image = {R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView Rv= findViewById(R.id.recycle1);

        MyAdapter adapt = new MyAdapter(this,CityName,array_image);

        GridLayoutManager grid1 = new GridLayoutManager(this, 2,GridLayoutManager.VERTICAL,false);
        Rv.setLayoutManager(grid1);
        Rv.setAdapter(adapt);
    }
}