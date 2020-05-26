package com.uisrael.ivanflores_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {


    Bundle datoRecibir1;
    TextView recibir1,etResultado;
    EditText et1,etNom,etMon;
    double valor1,valor2,resultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        recibir1 = findViewById(R.id.tvRecibir1);
        datoRecibir1 = getIntent().getExtras();
        String RecibirDato1 = datoRecibir1.getString("datoEnvio1");
        recibir1.setText(RecibirDato1);

        et1 = findViewById(R.id.etMonto);
        etResultado =findViewById(R.id.tvResultado);
        etNom = findViewById(R.id.etNombre);


    }

    public void calcularDatos(View v){

        valor1 = Integer.parseInt(et1.getText().toString());
        valor2 = (1800-valor1)/3;
        resultado = (1800 * 0.05)+valor2;

        etResultado.setText(String.valueOf(resultado));


    }


    public void envioDatos(View v){




        Intent intentEnvio = new Intent(getApplicationContext(), Encuesta.class);
        intentEnvio.putExtra("datoEnvio2",etNom.getText().toString());
        intentEnvio.putExtra("datoEnvio3",recibir1.getText().toString());
        intentEnvio.putExtra("datoEnvio4",etResultado.getText().toString());
        startActivity(intentEnvio);




    }


    }
