package com.quintincarr.materialdesign;

import androidx.annotation.NonNull;

public class Location {
    private String name;
    private int imageResourceId;

    public Location(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public static final Location[] locations ={
            new Location("Queen's Park",R.drawable.queenspark),
            new Location("Amigos", R.drawable.amigos),
            new Location("Anderson Park", R.drawable.andersonpark),
            new Location("Invercargill Central", R.drawable.invercargillcentral),
            new Location("Jump n  Fun", R.drawable.jumpnfun),
            new Location("Laser Tag (Galaxy Attack)", R.drawable.lasertag),
            new Location("The Langlands", R.drawable.thelanglands),
            new Location("Water Tower", R.drawable.watertower)
    };
    public static final Location[] cafes={
            new Location("Pinch of Spice", R.drawable.ic_channel_background),
            new Location("The Batch Cafe", R.drawable.ic_channel_background),
            new Location("Buster Crabb", R.drawable.ic_channel_background),
            new Location("Bombay Palace", R.drawable.ic_channel_background),
            new Location("The Grille", R.drawable.ic_channel_background),
            new Location("Industry", R.drawable.ic_channel_background)
    };
    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @NonNull
    @Override
    public String toString() {
        return getName();
    }
}


