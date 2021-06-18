package com.sp.breakingbad;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sp.breakingbad.modelos.Episodio;
import com.sp.breakingbad.modelos.Muerte;
import com.sp.breakingbad.modelos.Personaje;

import java.util.List;

public class MuerteAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Muerte> listMuertes;

    public MuerteAdapter(Activity activity, List<Muerte> listMuertes) {
        this.activity = activity;
        this.listMuertes = listMuertes;
    }

    @Override
    public int getCount() {
        return listMuertes.size();
    }

    @Override
    public Object getItem(int position) {
        return listMuertes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View m = convertView;
        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            m = inf.inflate(R.layout.item_muerte,null);
        }
        Muerte muerte = listMuertes.get(position);
        TextView personajeMuerte = m.findViewById(R.id.txvMuerto);
        personajeMuerte.setText(muerte.getPersonajeMuerte());
        TextView causaMuerte = m.findViewById(R.id.txvCausa);
        causaMuerte.setText(muerte.getCausaMuerte());
        TextView responsableMuerte = m.findViewById(R.id.txvResponsable);
        responsableMuerte.setText(muerte.getResponsableMuerte());
        TextView ultpalabrasMuerte = m.findViewById(R.id.txvPalabras);
        ultpalabrasMuerte.setText(muerte.getUltpalabrasMuerte());
        return m;
    }
}
