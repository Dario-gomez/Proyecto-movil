package com.example.misitiofavorito;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MisContactosActivity extends AppCompatActivity {

    private ArrayList<String> listaDeContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miscontactos);

        listaDeContactos = new ArrayList<>();

        Button buttonAddContact = findViewById(R.id.buttonAddContact);
        Button buttonDeleteContact = findViewById(R.id.buttonDeleteContact);
        EditText editTextName = findViewById(R.id.editTextName);

        buttonAddContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nuevoContacto = editTextName.getText().toString();

                if (!nuevoContacto.isEmpty()) {
                    listaDeContactos.add(nuevoContacto);
                    Toast.makeText(MisContactosActivity.this, "Contacto " + nuevoContacto + " agregado", Toast.LENGTH_SHORT).show();
                    editTextName.setText("");
                } else {
                    Toast.makeText(MisContactosActivity.this, "Ingrese un nombre para el contacto", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonDeleteContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!listaDeContactos.isEmpty()) {
                    String contactoBorrado = listaDeContactos.remove(listaDeContactos.size() - 1);
                    Toast.makeText(MisContactosActivity.this, "Contacto " + contactoBorrado + " borrado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MisContactosActivity.this, "La lista de contactos está vacía", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
