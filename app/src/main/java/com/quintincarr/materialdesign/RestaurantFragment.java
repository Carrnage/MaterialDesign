package com.quintincarr.materialdesign;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.fragment_restaurant);
        //populate views from Josh using ctrl-f
        String name = new String(Cafe.cafes.toString());
        Adapter adapter = new Adapter(name);
        recyclerView.setAdapter(adapter);
        return view;

    }
}