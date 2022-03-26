package com.example.hojadevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ProyectosRealizados extends AppCompatActivity {

    CheckBox chBox1, chBox2, chBox3, chBox4, chBox5, chBox6;
    private Integer traducido = 0;

    TextView prueba01, prueba02, prueba03, prueba04, prueba05, prueba06;

    Button btnCambiarUbicacion;

    Button btnNext, btnPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyectos_realizados);

        prueba01 = (TextView) findViewById(R.id.prueba01);
        prueba02 = (TextView) findViewById(R.id.prueba02);
        prueba03 = (TextView) findViewById(R.id.prueba03);
        prueba04 = (TextView) findViewById(R.id.prueba04);
        prueba05 = (TextView) findViewById(R.id.prueba05);
        prueba06 = (TextView) findViewById(R.id.prueba06);

        chBox1 = (CheckBox) findViewById(R.id.chBox1);
        chBox2 = (CheckBox) findViewById(R.id.chBox2);
        chBox3 = (CheckBox) findViewById(R.id.chBox3);
        chBox4 = (CheckBox) findViewById(R.id.chBox4);
        chBox5 = (CheckBox) findViewById(R.id.chBox5);
        chBox6 = (CheckBox) findViewById(R.id.chBox6);
        //btnCambiarUbicacion = (Button) findViewById(R.id.btnCambiarUbicacion);

        chBox1.setEnabled(false);
        chBox2.setEnabled(false);
        chBox3.setEnabled(false);
        chBox4.setEnabled(false);
        chBox5.setEnabled(false);
        chBox6.setEnabled(false);

        btnNext = (Button) findViewById(R.id.btnNext);
        btnPrevious = (Button) findViewById(R.id.btnPrevious);

        prueba01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CambiarUbicacion();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Next();
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
            prueba01.setText("Professional cyclist");
            prueba02.setText("motocross rider");
            prueba03.setText("System technique");
            prueba04.setText("Travels");
            prueba05.setText("motorcycle purchase");
            prueba06.setText("Work in technical and support");
        }

        if (traducido == 0){
            prueba01.setText("Ciclista profesional");
            prueba02.setText("Practicante de motocross");
            prueba03.setText("Técnico en sistemas");
            prueba04.setText("Viajes");
            prueba05.setText("Compra de moto");
            prueba06.setText("Trabajo en técnico y soporte");
        }
    }

    public void Next(){
        Intent i = new Intent(this, Referencias.class);
        startActivity(i);
    }

    public void Previous(){
        Intent i = new Intent(this, Hobbies.class);
        startActivity(i);
    }
}