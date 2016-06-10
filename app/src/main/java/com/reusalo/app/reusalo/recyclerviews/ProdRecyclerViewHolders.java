package com.reusalo.app.reusalo.recyclerviews;

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

    public TextView prodName;
    public TextView ownName;
    public TextView date;
    public TextView descr;
    public TextView estado;
    public ImageView prodPhoto;

    public ProdRecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        prodName = (TextView) itemView.findViewById(R.id.prod_name);
        ownName = (TextView) itemView.findViewById(R.id.owner_name);
        date = (TextView) itemView.findViewById(R.id.fecha);
        descr = (TextView) itemView.findViewById(R.id.descr);
        estado = (TextView) itemView.findViewById(R.id.estado);
        prodPhoto = (ImageView) itemView.findViewById(R.id.prod_photo);
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();

    }
}
