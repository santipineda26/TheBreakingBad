package com.sp.breakingbad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.sp.breakingbad.apiManager.RetrofitClient;
import com.sp.breakingbad.modelos.Episodio;
import com.sp.breakingbad.modelos.Muerte;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class list_Muerte extends AppCompatActivity {

    ListView listvMuerte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_muerte);

        listvMuerte = findViewById(R.id.listMuerte);
        getFromInternetMuerte();
    }

    private void getFromInternetMuerte() {
        Call<List<Muerte>> call = RetrofitClient.getInstance().getMyApi().getMuertes();
        call.enqueue(new Callback<List<Muerte>>() {
            @Override
            public void onResponse(Call<List<Muerte>> call, Response<List<Muerte>> response) {
                List<Muerte> myMuerte = response.body();
                String message = "";
                MuerteAdapter adapter = new MuerteAdapter(list_Muerte.this,myMuerte);
                listvMuerte.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Muerte>> call, Throwable t) {
                Toast.makeText(list_Muerte.this,"Falló",Toast.LENGTH_SHORT).show();

            }
        });
    }
}