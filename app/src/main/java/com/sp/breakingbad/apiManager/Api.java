package com.sp.breakingbad.apiManager;


import com.sp.breakingbad.modelos.Cita;
import com.sp.breakingbad.modelos.Episodio;
import com.sp.breakingbad.modelos.Muerte;
import com.sp.breakingbad.modelos.Personaje;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://www.breakingbadapi.com/api/";

    @GET("characters")
    Call<List<Personaje>>getPersonajes();

    @GET("episodes")
    Call<List<Episodio>>getEpisodios();

    @GET("deaths")
    Call<List<Muerte>>getMuertes();

    @GET("quotes")
    Call<List<Cita>>getCitas();
}
