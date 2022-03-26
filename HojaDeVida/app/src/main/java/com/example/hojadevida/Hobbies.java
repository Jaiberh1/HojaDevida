package com.example.hojadevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Hobbies extends AppCompatActivity {

    TextView hob1, hob2, hob3, hob4, hob5;
    ImageButton btnHobbies;
    Button btnCambiarUbicacion;

    int numHobbies = 5;

    private Integer traducido = 0;

    Button btnNext, btnPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);

        hob1 = (TextView) findViewById(R.id.hob1);
        hob2 = (TextView) findViewById(R.id.hob2);
        hob3 = (TextView) findViewById(R.id.hob3);
        hob4 = (TextView) findViewById(R.id.hob4);
        hob5 = (TextView) findViewById(R.id.hob5);
        btnHobbies = (ImageButton) findViewById(R.id.btnHobbies);

        btnCambiarUbicacion = (Button) findViewById(R.id.btnCambiarUbicacion);

        hob1.setVisibility(View.INVISIBLE);
        hob2.setVisibility(View.INVISIBLE);
        hob3.setVisibility(View.INVISIBLE);
        hob4.setVisibility(View.INVISIBLE);
        hob5.setVisibility(View.INVISIBLE);
        btnCambiarUbicacion.setVisibility(View.INVISIBLE);

        btnCambiarUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CambiarUbicacion();
            }
        });

        btnHobbies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CargarHobbie();
            }
        });

        btnNext = (Button) findViewById(R.id.btnNext);
        btnPrevious = (Button) findViewById(R.id.btnPrevious);

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
    public void CargarHobbie(){
        numHobbies--;
        if (numHobbies == 4){
            hob1.setVisibility(View.VISIBLE);
        }

        if (numHobbies == 3){
            hob2.setVisibility(View.VISIBLE);
        }

        if (numHobbies == 2){
            hob3.setVisibility(View.VISIBLE);
        }

        if (numHobbies == 1){
            hob4.setVisibility(View.VISIBLE);
        }

        if (numHobbies == 0){
            hob5.setVisibility(View.VISIBLE);
            btnCambiarUbicacion.setVisibility(View.VISIBLE);
        }

        if (numHobbies < 0){
            Toast.makeText(Hobbies.this, "NO HAY MAS HOBBIES...", Toast.LENGTH_SHORT).show();
        }
    }

    public void CambiarUbicacion(){
        traducido++;

        System.out.println(traducido);
        if (traducido > 1){
            traducido = 0;
        }

        if (traducido == 1){
            hob1.setText("drive motorcycle");
            hob2.setText("Cycling");
            hob3.setText("To sing");
            hob4.setText("Travel");
            hob5.setText("Share with your friends and family");
        }

        if (traducido == 0){
            hob1.setText("Manejar moto");
            hob2.setText("Ciclismo");
            hob3.setText("Cantar");
            hob4.setText("Viajar");
            hob5.setText("Compartir con sus amigos y familiares");
        }
    }

    public void Next(){
        Intent i = new Intent(this, ProyectosRealizados.class);
        startActivity(i);
    }

    public void Previous(){
        Intent i = new Intent(this, FotoDescripcion.class);
        startActivity(i);
    }
}