package com.example.myapplicationtarea1interfazdeusuariogatg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2INTERFAZUSUARIOGATG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_interfazusuariogatg);
        TextView txtdatos = (TextView)findViewById(R.id.iddatos);

        Bundle bundle = this.getIntent().getExtras();
        //Este apartado es para Visualizar la informacion del Usuario
        txtdatos.setText("Datos del Usuario,  " +
                " \n " +
                bundle.getString("CEDULA") +
                " \n " +
                bundle.getString("NOMBRE") +
                " \n " +
                bundle.getString("CIUDAD") +
                " \n " +
                bundle.getString("CORREO")+
                " \n " +
                bundle.getString("TELEFONO")
                + " \n " +
                bundle.getString("GENERO")
                + " \n " +
                bundle.getString("CALENDARIO")
        );
    }

}