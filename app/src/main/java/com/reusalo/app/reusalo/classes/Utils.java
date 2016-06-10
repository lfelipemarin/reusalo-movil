package com.reusalo.app.reusalo.classes;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import com.reusalo.app.reusalo.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by fmarin on 5/06/16.
 */
public class Utils {
    Context mContext;
    Bitmap bmImg;

    public Utils(Context context) {
        mContext = context;
    }

    public int getImagen(String nombre) {
        switch (nombre) {
            case "Celulares y tablets":
                return R.drawable.im_celutab;
            case "TV Audio y Foto":
                return R.drawable.im_tvaudfot;
            case "Consolas y videojuegos":
                return R.drawable.im_consolasjuego;
            case "Hogar":
                return R.drawable.im_hogar;
            case "Electrodomesticos":
                return R.drawable.im_electrodomestico;
            case "Salud y Bienestar":
                return R.drawable.im_saludybienes;
            case "Juguetes niños y bebes":
                return R.drawable.im_juguetes;
            case "Deportes":
                return R.drawable.im_deporte;
            case "Supermercados":
                return R.drawable.im_supermercado;
            case "Joyeria":
                return R.drawable.im_joyeria;
            default:
                return 0;
        }
    }

}
