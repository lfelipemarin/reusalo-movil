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
public class ProdsRecyclerViewAdapter extends RecyclerView.Adapter<ProdsRecyclerViewHolders> {

    private List<PojoModel> itemList;
    private Context context;
    private Utils utils;
    private int catId;

    public ProdsRecyclerViewAdapter(Context context, List<PojoModel> itemList, int catId) {
        this.itemList = itemList;
        this.context = context;
        this.catId = catId;
    }

    @Override
    public ProdsRecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        ProdsRecyclerViewHolders rcv = new ProdsRecyclerViewHolders(layoutView, catId);
        return rcv;
    }

    @Override
    public void onBindViewHolder(ProdsRecyclerViewHolders holder, int position) {
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
