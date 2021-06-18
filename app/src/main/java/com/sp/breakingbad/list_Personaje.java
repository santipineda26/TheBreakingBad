package com.sp.breakingbad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.sp.breakingbad.apiManager.RetrofitClient;
import com.sp.breakingbad.modelos.Personaje;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class list_Personaje extends AppCompatActivity {

    ListView listvPersonje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_personaje);

        listvPersonje = findViewById(R.id.listPersonaje);
        getFromInternetPersonaje();
    }

    private void getFromInternetPersonaje() {
        Call<List<Personaje>> call = RetrofitClient.getInstance().getMyApi().getPersonajes();
        call.enqueue(new Callback<List<Personaje>>() {
            @Override
            public void onResponse(Call<List<Personaje>> call, Response<List<Personaje>> response) {
                List<Personaje> myPersonaje = response.body();
                String message = "";
                PersonajeAdapter adapter = new PersonajeAdapter(list_Personaje.this,myPersonaje);
                listvPersonje.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Personaje>> call, Throwable t) {
                Toast.makeText(list_Personaje.this,"Falló",Toast.LENGTH_SHORT).show();

            }
        });
    }
}