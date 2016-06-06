package com.reusalo.app.reusalo.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.reusalo.app.reusalo.R;
import com.reusalo.app.reusalo.RecyclerViewAdapter;
import com.reusalo.app.reusalo.RestInterface;
import com.reusalo.app.reusalo.classes.ItemObject;
import com.reusalo.app.reusalo.classes.PojoModel;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {

    private GridLayoutManager linLayout;
    private static final String URL = "http://192.168.0.112:8081";
    private View view;

    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_top, container, false);
        //traerClima();

        //making object of RestAdapter
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint(URL).build();

        //Creating Rest Services
        RestInterface restInterface = adapter.create(RestInterface.class);

        //Calling method to get whether report
        restInterface.getCategorias(new Callback<List<PojoModel>>() {
            @Override
            public void success(List<PojoModel> pojoModels, Response response) {
                //mModel = model;
                linLayout = new GridLayoutManager(getActivity(), 1);

                RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view);
                rView.setHasFixedSize(true);
                rView.setLayoutManager(linLayout);

                RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(getActivity(), pojoModels);
                rView.setAdapter(rcAdapter);
            }

            @Override
            public void failure(RetrofitError error) {

                String merror = error.getMessage();
                Log.e("Error", merror);
                Toast.makeText(getActivity(), merror, Toast.LENGTH_SHORT).show();
            }
        });


        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Inicio");
    }

}
