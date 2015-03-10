package com.universidadcauca.movil.fragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.universidadcauca.movil.fragments.fragments.ColorFragment;
import com.universidadcauca.movil.fragments.fragments.ListaFragment;


public class MainActivity extends ActionBarActivity {

    ColorFragment color;
    ListaFragment lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color =  new ColorFragment();
        lista = new ListaFragment();

        FragmentTransaction fT = getSupportFragmentManager().beginTransaction();
        fT.replace(R.id.panel1, lista);
        fT.replace(R.id.panel2, color);
        fT.commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
