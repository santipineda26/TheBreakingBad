package com.sp.breakingbad;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sp.breakingbad.modelos.Personaje;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PersonajeAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Personaje> listPersonajes;

    public PersonajeAdapter(Activity activity, List<Personaje> listPersonajes) {
        this.activity = activity;
        this.listPersonajes = listPersonajes;
    }

    @Override
    public int getCount() {

        return listPersonajes.size();
    }

    @Override
    public Object getItem(int position) {

        return listPersonajes.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_personaje,null);
        }

        Personaje personaje = listPersonajes.get(position);

        TextView nombrePersonaje = v.findViewById(R.id.txvNombre);
        nombrePersonaje.setText(personaje.getNombrePersonaje());

        TextView estadoPersonaje = v.findViewById(R.id.txvEstado);
        estadoPersonaje.setText(personaje.getEstadoPersonaje());

        ImageView imgPersonaje = v.findViewById(R.id.imgvPersonaje);
        Picasso.get()
                .load(personaje.getImgPersonaje())
                .into(imgPersonaje);
        return v;



    }
}
