package com.nidia.personalizedlist;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.nidia.personalizedlist.adaptadores.AdaptadorDia;
import com.nidia.personalizedlist.week.Dias;


public class PersonalizedList extends Activity {
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalized_list);
        lista = (ListView) findViewById(R.id.lista);
        Dias[] args = new Dias[]{
                new Dias("Monday", "Soleado 28°C", R.drawable.img01),
                new Dias("Tuesday", "Soleado 30°C", R.drawable.img01),
                new Dias("Wednesday", "Nublado 27°C", R.drawable.img02),
                new Dias("Thursday", "Soleado 28°C", R.drawable.img01),
                new Dias("Friday", "Nublado 25°C", R.drawable.img02),
                new Dias("Saturday", "Lluvioso 26°C", R.drawable.img03),
                new Dias("Sunday", "Soleado 28°C", R.drawable.img01),
        };

        AdaptadorDia adap = new AdaptadorDia(this, args);
        lista.setAdapter(adap);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_personalized_list, menu);
        return true;
    }
}