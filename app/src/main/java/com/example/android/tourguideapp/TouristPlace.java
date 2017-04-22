package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TouristPlace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        String s1=getString(R.string.sukhnalake);
        locations.add(new Location(getString(R.string.place1),s1,R.drawable.sukhna));

        String s2=getString(R.string.rosegarden);
        locations.add(new Location(getString(R.string.place2),s2,R.drawable.rosegarden));


        String s3=getString(R.string.rockgarden);
        locations.add(new Location(getString(R.string.place3),s3,R.drawable.rockgarden));

        LocationAdapter l1=new LocationAdapter(this,locations);

        ListView items=(ListView)findViewById(R.id.locations_list);
        items.setAdapter(l1);
    }
}
