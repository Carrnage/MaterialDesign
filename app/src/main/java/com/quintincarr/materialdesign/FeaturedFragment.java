package com.quintincarr.materialdesign;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FeaturedFragment extends Fragment {

    public FeaturedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_featured, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        //populate views from Josh using ctrl-f
        String[] locationNames = new String[Location.locations.length];
        int[] imageIds = new int[Location.locations.length];
        for ( int i= 0 ; i < Location.locations.length; i++) {
            locationNames[i] = Location.locations[i].getName();
            imageIds[i] = Location.locations[i].getImageResourceId();
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(locationNames, imageIds);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager( 2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        return view;
    }
}