package com.reusalo.app.reusalo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.reusalo.app.reusalo.classes.ItemObject;
import com.reusalo.app.reusalo.classes.PojoModel;
import com.reusalo.app.reusalo.classes.Utils;

import java.util.List;

/**
 * Created by fmarin on 1/06/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {

    private List<PojoModel> itemList;
    private Context context;
    private Utils utils;

    public RecyclerViewAdapter(Context context, List<PojoModel> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
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
