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
