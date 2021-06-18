package com.sp.breakingbad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPersonajes;
    private Button btnEpisodios;
    private Button btnMuertes;
    private Button btnCitas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPersonajes = findViewById(R.id.btnPersonajes);
        btnEpisodios = findViewById(R.id.btnEpisodios);
        btnMuertes = findViewById(R.id.btnMuertes);
        btnCitas = findViewById(R.id.btnCitas);
        btnPersonajes.setOnClickListener(this);
        btnEpisodios.setOnClickListener(this);
        btnMuertes.setOnClickListener(this);
        btnCitas.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnPersonajes) {
            Intent intent= new Intent(this,list_Personaje.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnEpisodios) {
            Intent intent= new Intent(this,list_Episodio.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnMuertes) {
            Intent intent= new Intent(this,list_Muerte.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnCitas) {
            Intent intent= new Intent(this,list_Cita.class);
            startActivity(intent);
        }

    }
}
