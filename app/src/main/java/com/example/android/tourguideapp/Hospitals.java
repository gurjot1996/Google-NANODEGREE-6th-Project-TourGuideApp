package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class Hospitals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        String s1=getString(R.string.ivyhospital);
        locations.add(new Location(getString(R.string.hospital1),s1,R.drawable.ivyhospital));

        String s2=getString(R.string.PGI);
        locations.add(new Location(getString(R.string.hospital2),s2,R.drawable.pgi));


        String s3=getString(R.string.Fortis);
        locations.add(new Location(getString(R.string.hospital3),s3,R.drawable.fortis));

        LocationAdapter l1=new LocationAdapter(this,locations);

        ListView items=(ListView)findViewById(R.id.locations_list);
        items.setAdapter(l1);
    }

}

