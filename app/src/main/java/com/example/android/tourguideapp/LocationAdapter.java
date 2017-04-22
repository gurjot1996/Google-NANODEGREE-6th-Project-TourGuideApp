package com.example.android.tourguideapp;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by gurjot on 4/21/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    LocationAdapter(Context context, ArrayList<Location> locations){
        super(context,0,locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View locationView = convertView;
        if (locationView == null) {
            locationView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_layout, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView Name = (TextView) locationView.findViewById(R.id.Location_name);
        Name.setText(currentLocation.getNameOfPlace());

        TextView Description = (TextView) locationView.findViewById(R.id.Location_Desc);
        Description.setText(currentLocation.getDescription());

        ImageView Locationimage = (ImageView) locationView.findViewById(R.id.Location_image);
        Locationimage.setImageResource(currentLocation.getImageid());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return locationView;



    }
}
