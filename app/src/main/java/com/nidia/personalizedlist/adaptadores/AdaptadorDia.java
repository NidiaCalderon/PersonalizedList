package com.nidia.personalizedlist.adaptadores;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nidia.personalizedlist.R;
import com.nidia.personalizedlist.week.Dias;

import java.util.zip.Inflater;

public class AdaptadorDia extends ArrayAdapter{
    Activity context;
    Dias [] datos;

    public AdaptadorDia(Activity context, Dias[] datos){
        super(context, R.layout.adaptador_personal_lista_1, datos);

        this.context = context;
        this.datos = datos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        View item  = inflater.inflate(R.layout.adaptador_personal_lista_1,null);

        TextView dia = (TextView)item.findViewById(R.id.dia);
        dia.setText(datos[position].getDia());
        TextView desc = (TextView)item.findViewById(R.id.desc);
        desc.setText(datos[position].getDia());
        ImageView image = (ImageView)item.findViewById(R.id.image);
        image.setImageResource(datos[position].getImg());

        return item;

    }
}
