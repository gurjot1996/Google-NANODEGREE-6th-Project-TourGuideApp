package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Malls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        String s1=getString(R.string.Elante);
        locations.add(new Location(getString(R.string.mall1),s1,R.drawable.elante));

        String s2=getString(R.string.NCM);
        locations.add(new Location(getString(R.string.mall2),s2,R.drawable.ncm));


        LocationAdapter l1=new LocationAdapter(this,locations);

        ListView items=(ListView)findViewById(R.id.locations_list);
        items.setAdapter(l1);
    }
}
