package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button banterior;
    Button bsiguiente;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        banterior= findViewById(R.id.banterior2);
        banterior.setOnClickListener(this);
        bsiguiente=findViewById(R.id.bsiguiente2);
        bsiguiente.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==banterior.getId()){
            Intent intento1 = new Intent(view.getContext(), MainActivity.class);
            startActivity(intento1);
        }
        if (view.getId()==bsiguiente.getId()){
            Intent intento2 = new Intent(view.getContext(), MainActivity3.class);
            startActivity(intento2);
        }
    }
}