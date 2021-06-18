package com.sp.breakingbad.modelos;

import android.graphics.drawable.Drawable;

import com.google.gson.annotations.SerializedName;

public class Personaje {

    @SerializedName("char_id")
    private String idPersonaje;
    @SerializedName("name")
    private String nombrePersonaje;
    @SerializedName("status")
    private String estadoPersonaje;
    @SerializedName("img")
    private String imgPersonaje;

    public String getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(String idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getEstadoPersonaje() {
        return estadoPersonaje;
    }

    public void setEstadoPersonaje(String estadoPersonaje) {
        this.estadoPersonaje = estadoPersonaje;
    }

    public String getImgPersonaje() {
        return imgPersonaje;
    }

    public void setImgPersonaje(String imgPersonaje) {
        this.imgPersonaje = imgPersonaje;
    }
}
