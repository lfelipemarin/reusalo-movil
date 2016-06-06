package com.reusalo.app.reusalo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by fmarin on 1/06/16.
 */
public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView catName;
    public ImageView catPhoto;

    public RecyclerViewHolders(View itemView) {
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
