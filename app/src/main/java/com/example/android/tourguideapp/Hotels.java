package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        String s1=getString(R.string.jwdesc);
        locations.add(new Location(getString(R.string.hotel1),s1,R.drawable.jwchan));

        String s2=getString(R.string.Tajhotel);
        locations.add(new Location(getString(R.string.hotel2),s2,R.drawable.taj));


        String s3=getString(R.string.Lalit);
        locations.add(new Location(getString(R.string.hotel3),s3,R.drawable.lalit));

        LocationAdapter l1=new LocationAdapter(this,locations);

        ListView items=(ListView)findViewById(R.id.locations_list);
        items.setAdapter(l1);
    }


}
