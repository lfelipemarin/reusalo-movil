package com.reusalo.app.reusalo.fragments;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.reusalo.app.reusalo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavsFragment extends Fragment {


    public FavsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favs, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Mis Favoritos");
    }

}
