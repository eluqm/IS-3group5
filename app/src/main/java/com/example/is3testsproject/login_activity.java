package com.example.is3testsproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login_activity extends Activity {
    /** Called when the activity is first created. */
    TextView ingresar;
    TextView registrarse_ek1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        ingresar = (TextView) findViewById(R.id.ingresar);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login_activity.this, home_activity.class));
            }
        });

        registrarse_ek1 = (TextView) findViewById(R.id.registrarse_ek1);

        registrarse_ek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login_activity.this, register_activity.class));
            }
        });

    }

    public void onClickToHome(View v){
        startActivity(new Intent(login_activity.this, home_activity.class));
    }



}
