package com.example.misitiofavorito;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MisSitioFavoritoActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    EditText txtLatitud, txtLongitud;
    GoogleMap mMap;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.missitiofavorito);

        txtLatitud = findViewById(R.id.txtLatitud);
        txtLongitud = findViewById(R.id.txtLongitud);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

      LatLng Ecuador = new LatLng(-4.0052608,-79.1885624);
      mMap.addMarker(new MarkerOptions().position(Ecuador).title("Ecuador"));
      mMap.moveCamera(CameraUpdateFactory.newLatLng(Ecuador));

    }

    @Override
    public void onMapClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);

        mMap.clear();
        LatLng Ecuador = new LatLng(latLng.latitude,-latLng.longitude);
        mMap.addMarker(new MarkerOptions().position(Ecuador).title(""));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ecuador));

    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);

        mMap.clear();
        LatLng Ecuador = new LatLng(latLng.latitude,-latLng.longitude);
        mMap.addMarker(new MarkerOptions().position(Ecuador).title(""));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ecuador));
    }
}



