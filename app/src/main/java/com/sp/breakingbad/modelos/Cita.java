package com.sp.breakingbad.modelos;

import com.google.gson.annotations.SerializedName;

public class Cita {

    @SerializedName("id")
    private String idCita;
    @SerializedName("quote")
    private String Cita;
    @SerializedName("author")
    private String autorCita;

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getCita() {
        return Cita;
    }

    public void setCita(String cita) {
        Cita = cita;
    }

    public String getAutorCita() {
        return autorCita;
    }

    public void setAutorCita(String autorCita) {
        this.autorCita = autorCita;
    }
}
