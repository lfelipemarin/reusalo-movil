package com.reusalo.app.reusalo.classes;

/**
 * Created by fmarin on 5/06/16.
 */

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.reusalo.app.reusalo.R;

@Generated("org.jsonschema2pojo")
public class Categoria {
    Context mContext;

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("id_categoria")
    @Expose
    private Integer idCategoria;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("productos")
    @Expose
    private List<Producto> productos = new ArrayList<Producto>();

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The Id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The idCategoria
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria The id_categoria
     */
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return The nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre The nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return The productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos The productos
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}