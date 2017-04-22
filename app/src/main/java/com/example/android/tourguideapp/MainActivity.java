package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView obj1=(ImageView) findViewById(R.id.hospitals);
        obj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hospitalintent=new Intent(MainActivity.this,Hospitals.class);
                startActivity(hospitalintent);
            }
        });


        ImageView obj2=(ImageView) findViewById(R.id.hotels);
        obj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelintent=new Intent(MainActivity.this,Hotels.class);
                startActivity(hotelintent);
            }
        });


        ImageView obj3=(ImageView) findViewById(R.id.malls);
        obj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mallsintent=new Intent(MainActivity.this,Malls.class);
                startActivity(mallsintent);
            }
        });


        ImageView obj4=(ImageView) findViewById(R.id.tourists);
        obj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent touristsintent=new Intent(MainActivity.this,TouristPlace.class);
                startActivity(touristsintent);
            }
        });
    }
}
