package com.sp.breakingbad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.sp.breakingbad.apiManager.RetrofitClient;
import com.sp.breakingbad.modelos.Cita;
import com.sp.breakingbad.modelos.Muerte;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class list_Cita extends AppCompatActivity {

    ListView listvCita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cita);

        listvCita = findViewById(R.id.listCita);
        getFromInternetCita();
    }

    private void getFromInternetCita() {
        Call<List<Cita>> call = RetrofitClient.getInstance().getMyApi().getCitas();
        call.enqueue(new Callback<List<Cita>>() {
            @Override
            public void onResponse(Call<List<Cita>> call, Response<List<Cita>> response) {
                List<Cita> myCita = response.body();
                String message = "";
                CitaAdapter adapter = new CitaAdapter(list_Cita.this,myCita);
                listvCita.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Cita>> call, Throwable t) {
                Toast.makeText(list_Cita.this,"Falló",Toast.LENGTH_SHORT).show();

            }
        });
    }
}