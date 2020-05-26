package com.uisrael.ivanflores_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {

    CheckBox cb1,cb2,cb3;
    EditText etDato1;
    RadioButton rb1,rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        etDato1 = findViewById(R.id.etDato1);

        cb1 = findViewById(R.id.cbOpcion1);
        cb2 = findViewById(R.id.cbOpcion2);
        cb3 = findViewById(R.id.cbOpcion3);

        rb1 = findViewById(R.id.rbOpcion1);
        rb2 = findViewById(R.id.rbOpcion2);


    }

    public void envioDatos(View v){

        Intent intentEnvio = new Intent(this, Resumen.class);

        intentEnvio.putExtra("datoEnvio5",etDato1.getText().toString());



        if(cb1.isChecked()==true){
            Toast.makeText(getApplicationContext(),"Seleccionaste"+cb1.getText().toString(),Toast.LENGTH_SHORT).show();
            intentEnvio.putExtra("datoEnvio6",cb1.getText().toString());

        }
        if(cb2.isChecked()==true){
            Toast.makeText(getApplicationContext(),"Seleccionaste"+cb2.getText().toString(),Toast.LENGTH_SHORT).show();
            intentEnvio.putExtra("datoEnvio7",cb2.getText().toString());

        }
        if(cb3.isChecked()==true){
            Toast.makeText(getApplicationContext(),"Seleccionaste"+cb3.getText().toString(),Toast.LENGTH_SHORT).show();
            intentEnvio.putExtra("datoEnvio8",cb3.getText().toString());

        }


        if(rb1.isChecked()==true){
            Toast.makeText(getApplicationContext(),"verdadero"+rb1.getText().toString(),Toast.LENGTH_LONG).show();
            intentEnvio.putExtra("datoEnvio9",rb1.getText().toString());

        }else{
            Toast.makeText(getApplicationContext(),"falso"+rb2.getText().toString(),Toast.LENGTH_SHORT).show();
            intentEnvio.putExtra("datoEnvio9",rb2.getText().toString());

        }


        startActivity(intentEnvio);

    }




}
