package com.example.kalak.pruebagps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MiServicio servicio = new MiServicio(getApplicationContext());

        servicio.getLocation();

        Toast.makeText(getApplicationContext(), "Coords: "+servicio.getLatitud()+","+servicio.getLongitud(),
                Toast.LENGTH_LONG).show();
        Log.i("TAG", "Coords: " + servicio.getLatitud() + "," + servicio.getLongitud());


    }



}
