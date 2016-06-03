package com.reusalo.app.reusalo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.reusalo.app.reusalo.R;
import com.reusalo.app.reusalo.RecyclerViewAdapter;
import com.reusalo.app.reusalo.classes.ItemObject;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {

    private GridLayoutManager linLayout;

    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        List<ItemObject> rowListItem = getAllItemList();
        linLayout = new GridLayoutManager(getActivity(), 4);

        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(linLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(getActivity(), rowListItem);
        rView.setAdapter(rcAdapter);
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Inicio");
    }

    private List<ItemObject> getAllItemList() {

        List<ItemObject> allItems = new ArrayList<>();
        allItems.add(new ItemObject("United States", R.drawable.ic_facebook));
        allItems.add(new ItemObject("Canada", R.drawable.ic_google));
        allItems.add(new ItemObject("United Kingdom", R.drawable.three));
        allItems.add(new ItemObject("Germany", R.drawable.ic_menu_about));
        allItems.add(new ItemObject("Sweden", R.drawable.ic_menu_balance));
        allItems.add(new ItemObject("United Kingdom", R.drawable.ic_menu_config));
        allItems.add(new ItemObject("Germany", R.drawable.ic_menu_cuenta));
        allItems.add(new ItemObject("Sweden", R.drawable.ic_menu_favs));
        allItems.add(new ItemObject("United States", R.drawable.ic_google));
        allItems.add(new ItemObject("Canada", R.drawable.ic_menu_msjs));
        allItems.add(new ItemObject("United Kingdom", R.drawable.ic_menu_home));
        allItems.add(new ItemObject("Germany", R.drawable.ic_facebook));
        allItems.add(new ItemObject("Sweden", R.drawable.ic_menu_cuenta));
        allItems.add(new ItemObject("United Kingdom", R.drawable.three));
        allItems.add(new ItemObject("Germany", R.drawable.ic_facebook));
        allItems.add(new ItemObject("Sweden", R.drawable.ic_google));

        return allItems;
    }

}
