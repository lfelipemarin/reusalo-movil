package com.reusalo.app.reusalo.recyclerviews;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.reusalo.app.reusalo.R;
import com.reusalo.app.reusalo.fragments.ProductoDetailFragment;
import com.reusalo.app.reusalo.fragments.ProductosFragment;

/**
 * Created by fmarin on 1/06/16.
 */
public class ProdsRecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView catName;
    public ImageView catPhoto;
    private int catId;

    public ProdsRecyclerViewHolders(View itemView, int catId) {
        super(itemView);
        itemView.setOnClickListener(this);
        this.catId = catId;
        catName = (TextView) itemView.findViewById(R.id.cat_name);
        catPhoto = (ImageView) itemView.findViewById(R.id.cat_photo);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        ProductoDetailFragment productoDetailFragment = new ProductoDetailFragment();
        productoDetailFragment.setProdId(getPosition());
        productoDetailFragment.setProdName(catName.getText().toString());
        productoDetailFragment.setCatId(catId);
        FragmentTransaction ft = ((FragmentActivity) view.getContext()).getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, productoDetailFragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}
