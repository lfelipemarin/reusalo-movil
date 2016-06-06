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
