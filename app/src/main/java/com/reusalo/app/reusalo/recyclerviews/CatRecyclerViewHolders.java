package com.reusalo.app.reusalo.recyclerviews;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.reusalo.app.reusalo.R;
import com.reusalo.app.reusalo.fragments.ProductosFragment;

/**
 * Created by fmarin on 1/06/16.
 */
public class CatRecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView catName;
    public ImageView catPhoto;

    public CatRecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        catName = (TextView) itemView.findViewById(R.id.cat_name);
        catPhoto = (ImageView) itemView.findViewById(R.id.cat_photo);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        ProductosFragment productosFragment = new ProductosFragment();
        productosFragment.setCatId(getPosition());
        FragmentTransaction ft = ((FragmentActivity) view.getContext()).getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, productosFragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}
