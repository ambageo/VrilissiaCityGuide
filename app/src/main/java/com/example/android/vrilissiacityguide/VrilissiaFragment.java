package com.example.android.vrilissiacityguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * {@link Fragment} that displays the home page of the app.
 */
public class VrilissiaFragment extends Fragment {


    public VrilissiaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.vrilissia, container, false);

        return rootView;
    }

}
