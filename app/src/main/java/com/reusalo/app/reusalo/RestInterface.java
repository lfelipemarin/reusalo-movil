package com.reusalo.app.reusalo;

import com.reusalo.app.reusalo.classes.PojoModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Isabel on 08/05/2016.
 */
public interface RestInterface {
    String API_KEY = "8839b7df4f87730b86c09729e2c9c67f";

    @GET("/daily?mode=json&&units=metric&cnt=7&appid=" + API_KEY)
    void getWheatherReport(@Query("q") String city, Callback<PojoModel> cb);
}
