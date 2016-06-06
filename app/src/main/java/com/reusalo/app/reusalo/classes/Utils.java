package com.reusalo.app.reusalo.classes;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.reusalo.app.reusalo.R;

/**
 * Created by fmarin on 5/06/16.
 */
public class Utils {
    Context mContext;

    public Utils(Context context) {
        mContext = context;
    }

    public int getImagen(String nombre) {
        switch (nombre) {
            case "Celulares y tablets":
                return R.drawable.im_cels;
            case "TV Audio y Foto":
                return R.drawable.im_tvaudio;
            case "Consolas y videojuegos":
                return R.drawable.im_juegos;
            case "Hogar":
                return R.drawable.im_hogar;
            case "Electrodomesticos":
                return R.drawable.im_electro;
            default:
                return 0;
        }
    }
}
