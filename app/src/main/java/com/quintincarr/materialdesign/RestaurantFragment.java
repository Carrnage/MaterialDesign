package com.quintincarr.materialdesign;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Adapter;
import android.widget.ListAdapter;

public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_restaurant);
        String[] restaurantnames = new String[Location.cafes.length];
        int[] imageIds = new int[Location.locations.length];
        for ( int i= 0 ; i < Location.cafes.length; i++) {
            restaurantnames[i] = Location.cafes[i].getName();
            imageIds[i] = Location.cafes[i].getImageResourceId();
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(restaurantnames, imageIds);
        LinearLayoutManager linearLayoutManager = new
                LinearLayoutManager(view.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        return view;
    }
}