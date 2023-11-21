package com.example.borrador_aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gordas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gordas);
    }

    public void detalles(View view)
    {
        Intent i1 = new Intent(this, ventana_detalles.class);
        startActivity(i1);
    }

    public void otro_platillo(View view)
    {
        Intent i2 = new Intent(this, MainActivity.class);
        startActivity(i2);
    }
}