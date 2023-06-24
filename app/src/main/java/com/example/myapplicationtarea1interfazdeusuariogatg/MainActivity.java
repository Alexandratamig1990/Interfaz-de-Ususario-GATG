package com.example.myapplicationtarea1interfazdeusuariogatg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ENVIAR (View ENVIAR)
    {

        EditText Cedula = (EditText) findViewById(R.id.txtcedula);
        EditText Nombre = (EditText) findViewById(R.id.txtnombre);
        EditText Ciudad = (EditText) findViewById(R.id.txtciudad);
        EditText Correo = (EditText) findViewById(R.id.txtcorreo);
        EditText Telefono = (EditText) findViewById(R.id.txttelefono);
        RadioButton rbmasculino= (RadioButton) findViewById(R.id.rbmasculino);
        RadioButton rbfemenino= (RadioButton) findViewById(R.id.rbfemenino);
        CalendarView cvcalendario = (CalendarView) findViewById(R.id.cvcalendario);
        String cedula,nombre,ciudad,correo,telefono,gener;
        long calendario = cvcalendario.getDate();
        SimpleDateFormat fomatoFecha = new SimpleDateFormat("dd/mm/yyyy");
        String calendar = fomatoFecha.format(new Date());

        if (rbmasculino.isChecked())
            gener = "Estimado";
        else
            gener = "Estimada";
        cedula=Cedula.getText().toString();
        nombre=Nombre.getText().toString();
        ciudad=Ciudad.getText().toString();
        correo=Correo.getText().toString();
        telefono=Telefono.getText().toString();
        Intent intent = new Intent(MainActivity.this, MainActivity2INTERFAZUSUARIOGATG.class);
        Bundle b = new Bundle();
        b.putString("CEDULA", cedula);
        b.putString("NOMBRE", nombre);
        b.putString("CIUDAD", ciudad);
        b.putString("CORREO", correo);
        b.putString("TELEFONO", telefono);
        b.putString("GENERO", gener);
        b.putString("CALENDARIO", calendar);
        intent.putExtras(b);
        startActivity(intent);

    }
    public void LIMPIAR (View LIMPIAR)
    {
        EditText Cedula = (EditText) findViewById(R.id.txtcedula);
        EditText Nombre = (EditText) findViewById(R.id.txtnombre);
        EditText Ciudad = (EditText) findViewById(R.id.txtciudad);
        EditText Correo = (EditText) findViewById(R.id.txtcorreo);
        EditText Telefono = (EditText) findViewById(R.id.txttelefono);
        RadioButton rbmasculino= (RadioButton) findViewById(R.id.rbmasculino);
        RadioButton rbfemenino= (RadioButton) findViewById(R.id.rbfemenino);
        CalendarView cvcalendario = (CalendarView) findViewById(R.id.cvcalendario);
        Cedula.setText("");
        Nombre.setText("");
        Ciudad.setText("");
        Correo.setText("");
        Telefono.setText("");
        rbmasculino.setChecked(false);
        rbfemenino.setChecked(false);
        cvcalendario.setDate(System.currentTimeMillis());
    }
}