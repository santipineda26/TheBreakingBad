package com.sp.breakingbad;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sp.breakingbad.modelos.Episodio;
import com.sp.breakingbad.modelos.Personaje;

import java.util.List;

public class EpisodioAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Episodio> listEpisodios;

    public EpisodioAdapter(Activity activity, List<Episodio> listEpisodios) {
        this.activity = activity;
        this.listEpisodios = listEpisodios;
    }

    @Override
    public int getCount() {
        return listEpisodios.size();
    }

    @Override
    public Object getItem(int position) {
        return listEpisodios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View e = convertView;
        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            e = inf.inflate(R.layout.item_episodio,null);
        }

        Episodio episodio = listEpisodios.get(position);
        String[] personajesEpisodio = episodio.getPersonajesEpisodio();
        TextView tituloEpisodio = e.findViewById(R.id.txvTitulo);
        tituloEpisodio.setText(episodio.getTituloEpisodio());
        TextView temporadaEpisodio = e.findViewById(R.id.txvTemporada);
        temporadaEpisodio.setText(episodio.getTemporadaEpisodio());
        TextView numEpisodio = e.findViewById(R.id.txvEpisodio);
        numEpisodio.setText(episodio.getNumEpisodio());
        TextView personajesvEpisodio = e.findViewById(R.id.txvPersonajes);

        for (int i = 0; i < personajesEpisodio.length; i++) {
            String personajes = personajesEpisodio[i];

            personajesvEpisodio.setText(personajesvEpisodio.getText() + " " + personajes);
        }

        return e;
    }
}
