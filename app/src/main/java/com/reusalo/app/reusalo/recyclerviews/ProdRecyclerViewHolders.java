package com.reusalo.app.reusalo.recyclerviews;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.reusalo.app.reusalo.R;

/**
 * Created by fmarin on 1/06/16.
 */
public class ProdRecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView catName;
    public ImageView catPhoto;

    public ProdRecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        catName = (TextView) itemView.findViewById(R.id.cat_name);
        catPhoto = (ImageView) itemView.findViewById(R.id.cat_photo);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();

    }
}
