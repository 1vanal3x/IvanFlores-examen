package com.uisrael.ivanflores_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    Bundle datoRecibir1,datoRecibir2,datoRecibir3,datoRecibir4,datoRecibir5,datoRecibir6,datoRecibir7,datoRecibir8;
    TextView recibir1,recibir2,recibir3,recibir4,recibir5,recibir6,recibir7,recibir8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);



        recibir1 = findViewById(R.id.tvRecibir1);
        datoRecibir1 = getIntent().getExtras();
        String RecibirDato1 = datoRecibir1.getString("datoEnvio3");
        recibir1.setText(RecibirDato1);

        recibir2 = findViewById(R.id.tvRnombre);
        datoRecibir2 = getIntent().getExtras();
        String RecibirDato2 = datoRecibir2.getString("datoEnvio2");
        recibir2.setText(RecibirDato2);


        recibir3 = findViewById(R.id.tvRmonto);
        datoRecibir3 = getIntent().getExtras();
        String RecibirDato3 = datoRecibir3.getString("datoEnvio4");
        recibir3.setText(RecibirDato3);



        recibir4 = findViewById(R.id.tv5);
        datoRecibir4 = getIntent().getExtras();
        String RecibirDato4 = datoRecibir4.getString("datoEnvio5");
        recibir4.setText(RecibirDato4);

        recibir5 = findViewById(R.id.tv6);
        datoRecibir5 = getIntent().getExtras();
        String RecibirDato5 = datoRecibir5.getString("datoEnvio6");
        recibir5.setText(RecibirDato5);

        recibir6 = findViewById(R.id.tv7);
        datoRecibir6 = getIntent().getExtras();
        String RecibirDato6 = datoRecibir6.getString("datoEnvio7");
        recibir6.setText(RecibirDato6);

        recibir7 = findViewById(R.id.tv8);
        datoRecibir7 = getIntent().getExtras();
        String RecibirDato7 = datoRecibir7.getString("datoEnvio8");
        recibir7.setText(RecibirDato7);

        recibir8 = findViewById(R.id.tv9);
        datoRecibir8 = getIntent().getExtras();
        String RecibirDato8 = datoRecibir8.getString("datoEnvio9");
        recibir8.setText(RecibirDato8);


    }




}
