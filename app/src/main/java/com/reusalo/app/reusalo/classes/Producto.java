package com.reusalo.app.reusalo.classes;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by fmarin on 1/06/16.
 */

@Generated("org.jsonschema2pojo")
public class Producto {

    @SerializedName("id_prod")
    @Expose
    private Integer idProd;
    @SerializedName("id_usuario")
    @Expose
    private Integer idUsuario;
    @SerializedName("nombre_prod")
    @Expose
    private String nombreProd;
    @SerializedName("foto_prod")
    @Expose
    private String fotoProd;
    @SerializedName("descripcion_prod")
    @Expose
    private String descripcionProd;
    @SerializedName("estado")
    @Expose
    private String estado;
    @SerializedName("fecha_publicacion")
    @Expose
    private String fechaPublicacion;

    /**
     * @return The idProd
     */
    public Integer getIdProd() {
        return idProd;
    }

    /**
     * @param idProd The id_prod
     */
    public void setIdProd(Integer idProd) {
        this.idProd = idProd;
    }

    /**
     * @return The idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario The id_usuario
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return The nombreProd
     */
    public String getNombreProd() {
        return nombreProd;
    }

    /**
     * @param nombreProd The nombre_prod
     */
    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    /**
     * @return The fotoProd
     */
    public String getFotoProd() {
        return fotoProd;
    }

    /**
     * @param fotoProd The foto_prod
     */
    public void setFotoProd(String fotoProd) {
        this.fotoProd = fotoProd;
    }

    /**
     * @return The descripcionProd
     */
    public String getDescripcionProd() {
        return descripcionProd;
    }

    /**
     * @param descripcionProd The descripcion_prod
     */
    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    /**
     * @return The estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado The estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return The fechaPublicacion
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion The fecha_publicacion
     */
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

}