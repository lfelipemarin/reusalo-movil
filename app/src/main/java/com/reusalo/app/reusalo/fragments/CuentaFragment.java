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
public class CuentaFragment extends Fragment {


    public CuentaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cuenta, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Mi Cuenta");
    }
}
