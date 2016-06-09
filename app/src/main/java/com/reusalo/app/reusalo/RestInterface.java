package com.reusalo.app.reusalo;

import com.reusalo.app.reusalo.classes.PojoModel;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Isabel on 08/05/2016.
 */
public interface RestInterface {

    @GET("/categorias")
    void getCategorias(Callback<List<PojoModel>> cb);

    @GET("/categoria")
    void getCategoria(@Query("id") String id, Callback<PojoModel> cb);
}
