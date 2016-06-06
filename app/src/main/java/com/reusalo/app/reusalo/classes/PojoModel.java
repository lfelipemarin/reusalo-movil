package com.reusalo.app.reusalo.classes;

/**
 * Created by fmarin on 30/05/16.
 */

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PojoModel {

    @SerializedName("categorias")
    @Expose
    private List<Categoria> categorias = new ArrayList<Categoria>();

    /**
     * @return The categorias
     */
    public List<Categoria> getCategorias() {
        return categorias;
    }

    /**
     * @param categorias The categorias
     */
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public int size() {
        return categorias.size();
    }

}