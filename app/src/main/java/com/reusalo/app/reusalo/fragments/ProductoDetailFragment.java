package com.reusalo.app.reusalo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.reusalo.app.reusalo.BuildConfig;
import com.reusalo.app.reusalo.R;
import com.reusalo.app.reusalo.RestInterface;
import com.reusalo.app.reusalo.classes.PojoModel;
import com.reusalo.app.reusalo.recyclerviews.ProdRecyclerViewAdapter;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductoDetailFragment extends Fragment {

    private GridLayoutManager linLayout;
    //private static final String URL = "http://192.168.0.112:8081";
    private static final String URL = "https://reusalo.herokuapp.com";
    private View view;

    private String prodName;
    private int prodId;
    private int catId;

    public ProductoDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_producto_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        view = getView();
        if (view != null) {
            //making object of RestAdapter
            RestAdapter adapter = new RestAdapter.Builder().setEndpoint(URL)
                    .setLogLevel(BuildConfig.DEBUG ? RestAdapter.LogLevel.FULL : RestAdapter.LogLevel.NONE)
                    .build();

            //Creating Rest Services
            RestInterface restInterface = adapter.create(RestInterface.class);

            //Calling method to get whether report
            restInterface.getCategoria(String.valueOf(catId + 1), new Callback<PojoModel>() {
                @Override
                public void success(PojoModel pojoModel, Response response) {
                    //mModel = model;
                    linLayout = new GridLayoutManager(getActivity(), 1);

                    RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view);
                    rView.setHasFixedSize(true);
                    rView.setLayoutManager(linLayout);

                    ProdRecyclerViewAdapter rcAdapter = new ProdRecyclerViewAdapter(getActivity(),
                            pojoModel, prodId);
                    rView.setAdapter(rcAdapter);
                }

                @Override
                public void failure(RetrofitError error) {
                    String merror = error.getMessage();
                    Log.e("Error", merror);
                    Toast.makeText(getActivity(), merror, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        //getActivity().setTitle("Productos");
        getActivity().setTitle(prodName);
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
}
