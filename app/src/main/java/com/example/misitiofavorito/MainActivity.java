package com.example.misitiofavorito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.misitiofavorito.MisContactosActivity;
import com.example.misitiofavorito.MisImagenesFavoritasActivity;
import com.example.misitiofavorito.MisSitioFavoritoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMisSitios = findViewById(R.id.button);
        Button buttonMisImagenes = findViewById(R.id.button2);
        Button buttonMisContactos = findViewById(R.id.button3);

        buttonMisSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirMisSitioFavorito();
            }
        });

        buttonMisImagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirMisImagenesFavoritas();
            }
        });

        buttonMisContactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirMisContactos();
            }
        });
    }
    public void abrirMisSitioFavorito() {
        Intent intent = new Intent(this, MisSitioFavoritoActivity.class);
        startActivity(intent);
    }

    public void abrirMisImagenesFavoritas() {
        Intent intent = new Intent(this, MisImagenesFavoritasActivity.class);
        startActivity(intent);
    }

    public void abrirMisContactos() {
        Intent intent = new Intent(this, MisContactosActivity.class);
        startActivity(intent);
    }

}