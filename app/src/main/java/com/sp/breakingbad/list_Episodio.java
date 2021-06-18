package com.sp.breakingbad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.sp.breakingbad.apiManager.RetrofitClient;
import com.sp.breakingbad.modelos.Episodio;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class list_Episodio extends AppCompatActivity {

    ListView listvEpisodio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_episodio);

        listvEpisodio = findViewById(R.id.listEpisodio);
        getFromInternetEpisodio();
    }

    private void getFromInternetEpisodio() {
        Call<List<Episodio>> call = RetrofitClient.getInstance().getMyApi().getEpisodios();
        call.enqueue(new Callback<List<Episodio>>() {
            @Override
            public void onResponse(Call<List<Episodio>> call, Response<List<Episodio>> response) {
                List<Episodio> myEpisodio = response.body();
                String message = "";
                EpisodioAdapter adapter = new EpisodioAdapter(list_Episodio.this,myEpisodio);
                listvEpisodio.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Episodio>> call, Throwable t) {
                Toast.makeText(list_Episodio.this,"Falló",Toast.LENGTH_SHORT).show();

            }
        });
    }
}