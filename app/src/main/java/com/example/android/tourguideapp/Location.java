package com.example.android.tourguideapp;

import static android.R.attr.name;

/**
 * Created by gurjot on 4/21/17.
 */

public class Location  {
    private String NameOfPlace;
    private String Description;
    private int Imageid;

    Location(String name,String Desc,int imageid)
    {
        this.NameOfPlace=name;
        this.Description=Desc;
        this.Imageid=imageid;
    }

    public String getNameOfPlace()
    {
        return NameOfPlace;
    }

    public String getDescription()
    {
        return Description;
    }

    public int getImageid()
    {
        return Imageid;
    }

}
