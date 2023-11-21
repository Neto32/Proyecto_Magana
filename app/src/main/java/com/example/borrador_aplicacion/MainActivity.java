package com.example.borrador_aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_gordas(View view)
    {
        Intent v1 = new Intent(this, gordas.class);
        startActivity(v1);
    }

    public void btn_quesa(View view)
    {
        Intent v2 = new Intent(this, quesadillas.class);
        startActivity(v2);
    }

    public void btn_tacos(View view)
    {
        Intent v3 = new Intent(this, tacos.class);
        startActivity(v3);
    }

    public void btn_sope(View view)
    {
        Intent v4 = new Intent(this, sopes.class);
        startActivity(v4);
    }

    public void btn_huara(View view)
    {
        Intent v5 = new Intent(this, huaraches.class);
        startActivity(v5);
    }
}