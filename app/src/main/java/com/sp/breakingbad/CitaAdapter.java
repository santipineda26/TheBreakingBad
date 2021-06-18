package com.sp.breakingbad;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sp.breakingbad.modelos.Cita;
import com.sp.breakingbad.modelos.Muerte;

import java.util.List;

public class CitaAdapter  extends BaseAdapter {

    protected Activity activity;
    protected List<Cita> listCitas;

    public CitaAdapter(Activity activity, List<Cita> listCitas) {
        this.activity = activity;
        this.listCitas = listCitas;
    }

    @Override
    public int getCount() {
        return listCitas.size();
    }

    @Override
    public Object getItem(int position) {
        return listCitas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View c = convertView;
        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            c = inf.inflate(R.layout.item_cita,null);
        }
        Cita cita = listCitas.get(position);
        TextView Cita = c.findViewById(R.id.txvCita);
        Cita.setText(cita.getCita());
        TextView autorCita = c.findViewById(R.id.txvAutor);
        autorCita.setText(cita.getAutorCita());
        return c;
    }
}
