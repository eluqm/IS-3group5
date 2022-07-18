package com.example.is3testsproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mi_actividad_activity extends Activity {
    TextView mi_actividad_ek5;
    TextView my_profile_ek2;
    TextView tienda_ek6;
    TextView home_ek5;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        home_ek5 = (TextView) findViewById(R.id.home_ek5);

        home_ek5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mi_actividad_activity.this, home_activity.class));
            }
        });

        tienda_ek6 = (TextView) findViewById(R.id.tienda_ek6);

        tienda_ek6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mi_actividad_activity.this, tienda_activity.class));
            }
        });

        my_profile_ek2 = (TextView) findViewById(R.id.my_profile_ek2);

        my_profile_ek2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mi_actividad_activity.this, mi_perfil_activity.class));
            }
        });

        mi_actividad_ek5 = (TextView) findViewById(R.id.mi_actividad_ek5);

        mi_actividad_ek5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(mi_actividad_activity.this, mi_actividad_activity.class));
            }
        });

    }
}
