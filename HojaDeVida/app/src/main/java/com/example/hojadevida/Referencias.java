package com.example.hojadevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Referencias extends AppCompatActivity {

    TextView txtNombre, txtEspecialidad, txtTelefono, espe1, espe2, espe3;

    Button btnPrevious;
    Button btnCambiarUbicacion;

    private Integer traducido = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencias);

        txtNombre = (TextView) findViewById(R.id.txtNombre);
        txtEspecialidad = (TextView) findViewById(R.id.txtEspecialidad);
        txtTelefono = (TextView) findViewById(R.id.txtTelefono);
        espe1 = (TextView) findViewById(R.id.espe1);
        espe2 = (TextView) findViewById(R.id.espe2);
        espe3 = (TextView) findViewById(R.id.espe3);

        btnCambiarUbicacion = (Button) findViewById(R.id.btnCambiarUbicacion);

        btnPrevious = (Button) findViewById(R.id.btnPrevious);

        btnCambiarUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CambiarUbicacion();
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Previous();
            }
        });
    }

    public void CambiarUbicacion(){
        traducido++;

        System.out.println(traducido);
        if (traducido > 1){
            traducido = 0;
        }

        if (traducido == 1){
            txtNombre.setText("NAME");
            txtEspecialidad.setText("SPECIALTY");
            txtTelefono.setText("PHONE");
            espe1.setText("Internationalist");
            espe2.setText("Businessman");
            espe3.setText("Student");
        }

        if (traducido == 0){
            txtNombre.setText("NOMBRE");
            txtEspecialidad.setText("ESPECIALIDAD");
            txtTelefono.setText("TELEFONO");
            espe1.setText("Internacionalista");
            espe2.setText("Comerciante");
            espe3.setText("Estudiante");
        }
    }

    public void Previous(){
        Intent i = new Intent(this, ProyectosRealizados.class);
        startActivity(i);
    }
}