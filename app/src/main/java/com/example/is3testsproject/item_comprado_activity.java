package com.example.is3testsproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class item_comprado_activity extends Activity {
    TextView mi_actividad_ek1;
    TextView my_profile_ek1;
    TextView tienda_ek5;
    TextView home_ek4;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        my_profile_ek1 = (TextView) findViewById(R.id.my_profile_ek1);

        my_profile_ek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(item_comprado_activity.this, mi_perfil_activity.class));
            }
        });

        tienda_ek5 = (TextView) findViewById(R.id.tienda_ek5);

        tienda_ek5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(item_comprado_activity.this, tienda_activity.class));
            }
        });

        home_ek4 = (TextView) findViewById(R.id.home_ek4);

        home_ek4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(item_comprado_activity.this, home_activity.class));
            }
        });

        mi_actividad_ek1 = (TextView) findViewById(R.id.mi_actividad_ek1);

        mi_actividad_ek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(item_comprado_activity.this, mi_actividad_activity.class));
            }
        });

    }
}
