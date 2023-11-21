package com.example.borrador_aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ventana_detalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_detalles);
    }

    public void enviar(View view)
    {
        Intent iI = new Intent(this, MainActivity.class);
        startActivity(iI);
    }
}