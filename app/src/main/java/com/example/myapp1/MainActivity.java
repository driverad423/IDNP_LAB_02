package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre,apellido,dni,cui,correo,edad,facultad,escuela;
    Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre      = (EditText)findViewById(R.id.editNombre);
        apellido    = (EditText)findViewById(R.id.editApellido);
        dni         = (EditText)findViewById(R.id.editDni);
        cui         = (EditText)findViewById(R.id.editCui);
        correo      = (EditText)findViewById(R.id.editCorreo);
        edad        = (EditText)findViewById(R.id.editEdad);
        facultad    = (EditText)findViewById(R.id.editFacultad);
        escuela     = (EditText)findViewById(R.id.editEscuela);
        enviar      = (Button)findViewById(R.id.btnEnviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String _nombre= nombre.getText().toString();
                String _apellido= apellido.getText().toString();
                String _dni= dni.getText().toString();
                String _cui= cui.getText().toString();
                String _correo= correo.getText().toString();
                String _edad= edad.getText().toString();
                String _facultad= facultad.getText().toString();
                String _escuela= escuela.getText().toString();


                Intent i = new Intent(MainActivity.this,MostrarDatos.class);

                i.putExtra("_nombre",_nombre);
                i.putExtra("_apellido",_apellido);
                i.putExtra("_dni",_dni);
                i.putExtra("_cui",_cui);
                i.putExtra("_correo",_correo);
                i.putExtra("_edad",_edad);
                i.putExtra("_facultad",_facultad);
                i.putExtra("_escuela",_escuela);





                startActivity(i);

            }
        });



    }
}