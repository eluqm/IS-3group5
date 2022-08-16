package com.example.is3testsproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tienda_activity extends Activity {
    TextView mi_actividad;
    TextView my_profile;
    TextView tienda_ek4;
    TextView home_ek2;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mi_actividad = (TextView) findViewById(R.id.mi_actividad);

        mi_actividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tienda_activity.this, mi_actividad_activity.class));
            }
        });

        my_profile = (TextView) findViewById(R.id.my_profile);

        my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tienda_activity.this, mi_perfil_activity.class));
            }
        });

        tienda_ek4 = (TextView) findViewById(R.id.tienda_ek4);

        tienda_ek4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tienda_activity.this, tienda_activity.class));
            }
        });

        home_ek2 = (TextView) findViewById(R.id.home_ek2);

        home_ek2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tienda_activity.this, home_activity.class));
            }
        });

    }
}
