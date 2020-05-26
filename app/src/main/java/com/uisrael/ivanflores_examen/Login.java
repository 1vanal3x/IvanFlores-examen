package com.uisrael.ivanflores_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText txtUsr, txtPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtUsr = findViewById(R.id.etUsuario);
        txtPass = findViewById(R.id.etContraseña);

    }


    public void verificar(View v){

        String vUsr = txtUsr.getText().toString();
        String vPass = txtPass.getText().toString();
        if(vUsr.equals("estudiante2020") && vPass.equals("uisrael2020")){

            Intent intentEnvio = new Intent(this,Registro.class);
            intentEnvio.putExtra("datoEnvio1",txtUsr.getText().toString());
            startActivity(intentEnvio);

        }else
        {
            Toast.makeText(getApplicationContext(), "usuario o contrasena Erronea", Toast.LENGTH_SHORT).show();
        }


    }


}
