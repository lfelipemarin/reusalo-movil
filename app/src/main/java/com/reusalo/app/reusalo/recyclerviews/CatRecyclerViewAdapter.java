package com.reusalo.app.reusalo.recyclerviews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.reusalo.app.reusalo.R;
import com.reusalo.app.reusalo.classes.PojoModel;
import com.reusalo.app.reusalo.classes.Utils;

import java.util.List;

/**
 * Created by fmarin on 1/06/16.
 */
public class CatRecyclerViewAdapter extends RecyclerView.Adapter<CatRecyclerViewHolders> {

    private List<PojoModel> itemList;
    private Context context;
    private Utils utils;

    public CatRecyclerViewAdapter(Context context, List<PojoModel> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public CatRecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        CatRecyclerViewHolders rcv = new CatRecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(CatRecyclerViewHolders holder, int position) {
        utils = new Utils(context);
        String nombre = itemList.get(0).getCategorias().get(position).getNombre();
        holder.catName.setText(nombre);
        holder.catPhoto.setImageResource(utils.getImagen(nombre));
    }

    @Override
    public int getItemCount() {
        return this.itemList.get(0).size();
    }
}
