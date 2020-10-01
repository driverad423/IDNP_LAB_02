package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostrarDatos extends AppCompatActivity {

    TextView tvNombre,tvApellido, tvDni, tvCui, tvCorreo, tvEdad, tvFacultad,tvEscuela;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvApellido = (TextView)findViewById(R.id.tvApellido);
        tvDni = (TextView)findViewById(R.id.tvDni);
        tvCui = (TextView)findViewById(R.id.tvCui);
        tvCorreo = (TextView)findViewById(R.id.tvCorreo);
        tvEdad = (TextView)findViewById(R.id.tvEdad);
        tvFacultad = (TextView)findViewById(R.id.tvFacultad);
        tvEscuela = (TextView)findViewById(R.id.tvEscuela);

        btnOk = (Button)findViewById(R.id.btnok);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MostrarDatos.this, MainActivity.class);
                startActivity(i);
            }
        });


        mostrarDato();
    }

    private void mostrarDato() {

        Bundle datos= this.getIntent().getExtras();
        String nombre =  datos.getString("_nombre");
        String apellido =  datos.getString("_apellido");
        String dni =  datos.getString("_dni");
        String cui =  datos.getString("_cui");
        String correo =  datos.getString("_correo");
        String edad =  datos.getString("_edad");
        String facultad =  datos.getString("_facultad");
        String escuela =  datos.getString("_escuela");

        tvNombre.setText(nombre);
        tvApellido.setText(apellido);
        tvDni.setText(dni);
        tvCui.setText(cui);
        tvCorreo.setText(correo);
        tvEdad.setText(edad);
        tvFacultad.setText(facultad);
        tvEscuela.setText(escuela);


    }
}