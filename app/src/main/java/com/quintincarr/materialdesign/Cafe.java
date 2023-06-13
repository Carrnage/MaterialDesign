package com.quintincarr.materialdesign;

import androidx.annotation.NonNull;

public class Cafe {
    private String cafName;
    public Cafe(String cafName){
        this.cafName = cafName;
    }
    public static final Cafe[] cafes ={
            new Cafe("Pinch of Spice"),
            new Cafe("The Batch Cafe"),
            new Cafe("Buster Crabb"),
            new Cafe("Bombay Palace"),
            new Cafe("The Grille"),
            new Cafe("Industry")
    };

    public String getCafName() {
        return cafName;
    }
    @NonNull
    @Override
    public String toString() {
        return getCafName();
    }
}
