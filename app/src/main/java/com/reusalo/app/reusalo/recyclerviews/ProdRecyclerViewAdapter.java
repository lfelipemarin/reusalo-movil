package com.reusalo.app.reusalo.recyclerviews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.reusalo.app.reusalo.R;
import com.reusalo.app.reusalo.classes.PojoModel;
import com.reusalo.app.reusalo.classes.Utils;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by fmarin on 1/06/16.
 */
public class ProdRecyclerViewAdapter extends RecyclerView.Adapter<ProdRecyclerViewHolders> {

    private PojoModel itemList;
    private Context context;
    private Utils utils;
    private int prodId;

    public ProdRecyclerViewAdapter(Context context, PojoModel itemList, int prodId) {
        this.itemList = itemList;
        this.context = context;
        this.prodId = prodId;
    }

    @Override
    public ProdRecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_prod, null);
        ProdRecyclerViewHolders rcv = new ProdRecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(ProdRecyclerViewHolders holder, int position) {
        utils = new Utils(context);
        String nombre = itemList.getProductos().get(prodId).getNombreProd();
        holder.prodName.setText(nombre);
        holder.estado.setText(itemList.getProductos().get(prodId).getEstado());
        holder.descr.setText(itemList.getProductos().get(prodId).getDescripcionProd());
        holder.date.setText(itemList.getProductos().get(prodId).getFechaPublicacion());
        String imageUrl = itemList.getProductos().get(prodId).getFotoProd();
        Picasso.with(holder.prodPhoto.getContext()).load(imageUrl).into(holder.prodPhoto);
    }

    @Override
    public int getItemCount() {
        //return this.itemList.getProductos().size();
        return 1;
    }
}
