package com.sp.breakingbad.modelos;

import com.google.gson.annotations.SerializedName;

public class Muerte {

    @SerializedName("id")
    private String idMuerte;
    @SerializedName("death")
    private String personajeMuerte;
    @SerializedName("cause")
    private String causaMuerte;
    @SerializedName("responsible")
    private String responsableMuerte;
    @SerializedName("last_words")
    private String ultpalabrasMuerte;

    public String getIdMuerte() {
        return idMuerte;
    }

    public void setIdMuerte(String idMuerte) {
        this.idMuerte = idMuerte;
    }

    public String getPersonajeMuerte() {
        return personajeMuerte;
    }

    public void setPersonajeMuerte(String personajeMuerte) {
        this.personajeMuerte = personajeMuerte;
    }

    public String getCausaMuerte() {
        return causaMuerte;
    }

    public void setCausaMuerte(String causaMuerte) {
        this.causaMuerte = causaMuerte;
    }

    public String getResponsableMuerte() {
        return responsableMuerte;
    }

    public void setResponsableMuerte(String responsableMuerte) {
        this.responsableMuerte = responsableMuerte;
    }

    public String getUltpalabrasMuerte() {
        return ultpalabrasMuerte;
    }

    public void setUltpalabrasMuerte(String ultpalabrasMuerte) {
        this.ultpalabrasMuerte = ultpalabrasMuerte;
    }
}
