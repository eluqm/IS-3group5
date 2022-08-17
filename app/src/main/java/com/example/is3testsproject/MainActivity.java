package com.example.is3testsproject;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.is3testsproject.databinding.ActivityMainBinding;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.FitnessOptions;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DataReadResponse;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.text.DateFormat.getDateInstance;
import static java.text.DateFormat.getTimeInstance;

public class MainActivity extends AppCompatActivity  {

    private ActivityMainBinding binding;
    //Google fitness

    public static final String TAG = "MainActivity";
    private String[] REQUIRED_PERMISSIONS;
    FragmentManager fragmentManager;
    SensorFragment sensorFragment;
    ActivityResultLauncher<String[]> rpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG","QUE PEDO QUE PEDO");

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_activity, R.id.navigation_store, R.id.navigation_profile)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        // Google Fitness

        // Permissions
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
            REQUIRED_PERMISSIONS = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACTIVITY_RECOGNITION"};
//            REQUIRED_PERMISSIONS = new String[]{Manifest.permission.ACTIVITY_RECOGNITION, Manifest.permission.ACCESS_FINE_LOCATION};
            Log.v(TAG, "android 12 activity and fine location");
        } else {
            REQUIRED_PERMISSIONS = new String[]{ Manifest.permission.ACTIVITY_RECOGNITION};
            Log.v(TAG, "below android 12 activity recognition needed.");
        }
        rpl = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(),
                new ActivityResultCallback<Map<String, Boolean>>() {
                    @Override
                    public void onActivityResult(Map<String, Boolean> isGranted) {
                        boolean granted = true;
                        for (Map.Entry<String, Boolean> x : isGranted.entrySet()) {
                            Log.v(TAG, x.getKey() + " is " + x.getValue());
                            if (!x.getValue()) granted = false;
                        }
                        if (granted) {
                            Log.v(TAG, "All permissions are granted.");
                            //they likely died first without permissions, so just do it again.
                            sensorFragment = new SensorFragment();
//                            recordFragment = new RecordFragment();
                            fragmentManager.beginTransaction().replace( R.id.ResultsSensor, sensorFragment).commit();
                            Toast.makeText(getApplicationContext(), "Activity access granted", Toast.LENGTH_SHORT).show();
                        } else {
                            Log.v(TAG, "One of more permissions were NOT granted.");
                            Toast.makeText(getApplicationContext(), "Activity access NOT granted", Toast.LENGTH_SHORT).show();
                            finish();

                        }
                    }
                }
        );
        fragmentManager = getSupportFragmentManager();

        //first instance, so the default is zero.
        if (allPermissionsGranted()) {
            sensorFragment = new SensorFragment();
//            fragmentManager.beginTransaction().replace(R.id.ResultsSensor, sensorFragment).commit();
        }  //else wait until it comes back.

    }
    @Override
    protected void onResume() {
        super.onResume();
        if (!allPermissionsGranted())
            rpl.launch(REQUIRED_PERMISSIONS);
        else
            Log.v(TAG, "All permissions have been granted already.");
    }
    private boolean allPermissionsGranted() {
        for (String permission : REQUIRED_PERMISSIONS) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == SensorFragment.REQUEST_OAUTH) {
            sensorFragment.onActivityResult(requestCode, resultCode, data);
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}