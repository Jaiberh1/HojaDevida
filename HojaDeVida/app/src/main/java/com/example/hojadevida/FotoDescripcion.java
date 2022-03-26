package com.example.hojadevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FotoDescripcion extends AppCompatActivity {

    private String desSpanish = "Ingenieria de sistemas\n" +
            "C.C 1003842655\n" +
            "4to semestre\n" +
            "Cel 3143828062\n" +
            "Género masculino \n" +
            "Estatura 1.80\n" +
            "Moreno y ondulado \n" +
            "Inteligente \n" +
            "Sociable";

    private String desIngles = "Systems engineer\n" +
            "CC 1003842655\n" +
            "4th semester\n" +
            "Cell 3143828062\n" +
            "Male gender\n" +
            "Height 1.80\n" +
            "brown and wavy\n" +
            "Smart\n" +
            "Sociable";

    private Integer traducido = 0;
    private TextView descripcion;
    Button btnCambiarUbicacion;

    Button btnNext, btnPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_descripcion);

        descripcion = (TextView) findViewById(R.id.txtdescripcion);
        btnCambiarUbicacion = (Button) findViewById(R.id.btnCambiarUbicacion);

        btnNext = (Button) findViewById(R.id.btnNext);
        btnPrevious = (Button) findViewById(R.id.btnPrevious);

        descripcion.setText(desSpanish);

        //Botones
        btnCambiarUbicacion.setOnClickListener(new View.OnClickListener() {
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
            descripcion.setText(desIngles);
        }

        if (traducido == 0){
            descripcion.setText(desSpanish);
        }
    }

    public void Next(){
        Intent i = new Intent(this, Hobbies.class);
        startActivity(i);
    }

    public void Previous(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}