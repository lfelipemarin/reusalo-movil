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

    private List<PojoModel> itemList;
    private Context context;
    private Utils utils;
    private int catId;

    public ProdRecyclerViewAdapter(Context context, List<PojoModel> itemList, int catId) {
        this.itemList = itemList;
        this.context = context;
        this.catId = catId;
    }

    @Override
    public ProdRecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        ProdRecyclerViewHolders rcv = new ProdRecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(ProdRecyclerViewHolders holder, int position) {
        utils = new Utils(context);
        String nombre = itemList.get(catId).getProductos().get(position).getNombreProd();
        holder.catName.setText(nombre);
        String imageUrl = itemList.get(catId).getProductos().get(position).getFotoProd();
        Picasso.with(holder.catPhoto.getContext()).load(imageUrl).into(holder.catPhoto);
    }

    @Override
    public int getItemCount() {
        return this.itemList.get(catId).getProductos().size();
    }
}
