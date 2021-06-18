package com.sp.breakingbad.modelos;

import com.google.gson.annotations.SerializedName;

public class Episodio {

    @SerializedName("episode_id")
    private String idEpisodio;
    @SerializedName("title")
    private String tituloEpisodio;
    @SerializedName("season")
    private String temporadaEpisodio;
    @SerializedName("episode")
    private String numEpisodio;
    @SerializedName("characters")
    private String[] personajesEpisodio;

    public String getIdEpisodio() {
        return idEpisodio;
    }

    public void setIdEpisodio(String idEpisodio) {
        this.idEpisodio = idEpisodio;
    }

    public String getTituloEpisodio() {
        return tituloEpisodio;
    }

    public void setTituloEpisodio(String tituloEpisodio) {
        this.tituloEpisodio = tituloEpisodio;
    }

    public String getTemporadaEpisodio() {
        return temporadaEpisodio;
    }

    public void setTemporadaEpisodio(String temporadaEpisodio) {
        this.temporadaEpisodio = temporadaEpisodio;
    }

    public String getNumEpisodio() {
        return numEpisodio;
    }

    public void setNumEpisodio(String numEpisodio) {
        this.numEpisodio = numEpisodio;
    }

    public String[] getPersonajesEpisodio() {
        return personajesEpisodio;
    }

    public void setPersonajesEpisodio(String[] personajesEpisodio) {
        this.personajesEpisodio = personajesEpisodio;
    }
}
