package com.example.is3testsproject.ui.maps;

import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.is3testsproject.MainActivity;
import com.example.is3testsproject.R;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;


import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;

import java.util.Arrays;
import java.util.List;


public class MapsFragment extends Fragment {


    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        private boolean locationPermissionGranted;
        private PlacesClient placesClient;
        private static final int M_MAX_ENTRIES = 5;
        private String[] likelyPlaceNames;
        private String[] likelyPlaceAddresses;
        private List[] likelyPlaceAttributions;
        private LatLng[] likelyPlaceLatLngs;
        private final String TAG = "MapsFragment";
        private static final int DEFAULT_ZOOM = 15;
        private FusedLocationProviderClient fusedLocationProviderClient;
        private static final String KEY_CAMERA_POSITION = "camera_position";
        private static final String KEY_LOCATION = "location";


        private Location lastKnownLocation;

        private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;

        private GoogleMap googleMapmap;
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap map) {
            googleMapmap = map;

            getLocationPermission();
            updateLocationUI();
//            getDeviceLocation();
        }
        private void openPlacesDialog() {
            // Ask the user to choose the place where they are now.
            DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // The "which" argument contains the position of the selected item.
                    LatLng markerLatLng = likelyPlaceLatLngs[which];
                    String markerSnippet = likelyPlaceAddresses[which];
                    if (likelyPlaceAttributions[which] != null) {
                        markerSnippet = markerSnippet + "\n" + likelyPlaceAttributions[which];
                    }

                    // Add a marker for the selected place, with an info window
                    // showing information about that place.
                    googleMapmap.addMarker(new MarkerOptions()
                            .title(likelyPlaceNames[which])
                            .position(markerLatLng)
                            .snippet(markerSnippet));

                    // Position the map's camera at the location of the marker.
                    googleMapmap.moveCamera(CameraUpdateFactory.newLatLngZoom(markerLatLng,
                            DEFAULT_ZOOM));
                }
            };

            // Display the dialog.
//            AlertDialog dialog = new AlertDialog.Builder(this)
//                    .setTitle(R.string.pick_place)
//                    .setItems(likelyPlaceNames, listener)
//                    .show();
        }
        private void getLocationPermission() {
            /*
             * Request location permission, so that we can get the location of the
             * device. The result of the permission request is handled by a callback,
             * onRequestPermissionsResult.
             */
            if (ContextCompat.checkSelfPermission(getActivity().getApplicationContext(),
                    android.Manifest.permission.ACCESS_FINE_LOCATION)
                    == PackageManager.PERMISSION_GRANTED) {
                locationPermissionGranted = true;
            } else {
                ActivityCompat.requestPermissions(getActivity(),
                        new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                        PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
            }
        }
        private void updateLocationUI() {
            if (googleMapmap == null) {
                return;
            }
            try {
                if (locationPermissionGranted) {
                    googleMapmap.setMyLocationEnabled(true);
                    googleMapmap.getUiSettings().setMyLocationButtonEnabled(true);
                } else {
                    googleMapmap.setMyLocationEnabled(false);
                    googleMapmap.getUiSettings().setMyLocationButtonEnabled(false);
                    lastKnownLocation = null;
                    getLocationPermission();
                }
            } catch (SecurityException e)  {
                Log.e("Exception: %s", e.getMessage());
            }
        }
        private void getDeviceLocation() {
            /*
             * Get the best and most recent location of the device, which may be null in rare
             * cases when a location is not available.
             */
            try {
                if (locationPermissionGranted) {
                    Task<Location> locationResult = fusedLocationProviderClient.getLastLocation();
                    locationResult.addOnCompleteListener(getActivity(), new OnCompleteListener<Location>() {
                        @Override
                        public void onComplete(@NonNull Task<Location> task) {
                            if (task.isSuccessful()) {
                                // Set the map's camera position to the current location of the device.
                                lastKnownLocation = task.getResult();
                                if (lastKnownLocation != null) {
                                    googleMapmap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                                            new LatLng(lastKnownLocation.getLatitude(),
                                                    lastKnownLocation.getLongitude()), DEFAULT_ZOOM));
                                }
                            } else {
                                Log.d(TAG, "Current location is null. Using defaults.");
                                Log.e(TAG, "Exception: %s", task.getException());
                                googleMapmap.moveCamera(CameraUpdateFactory
                                        .newLatLngZoom(new LatLng(-33.8523341, 151.2106085), DEFAULT_ZOOM));
                                googleMapmap.getUiSettings().setMyLocationButtonEnabled(false);
                            }
                        }
                    });
                }
            } catch (SecurityException e)  {
                Log.e("Exception: %s", e.getMessage(), e);
            }
        }




    };





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }

}