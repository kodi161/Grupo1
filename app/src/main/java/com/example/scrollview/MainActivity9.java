package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity9 extends AppCompatActivity implements View.OnClickListener {
    Button anterior;
    Button validar;
    TextInputLayout til;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        anterior=findViewById(R.id.banterior9);
        validar=findViewById(R.id.bvalidar);
        validar.setOnClickListener(this);
        anterior.setOnClickListener(this);
        til=findViewById(R.id.til_telefono);
    }
    public void onClick(View view) {
        if (view.getId()==validar.getId()){
           String telefono = til.getEditText().getText().toString();
           //Permite saber si se introducen letras en vez de numeros
                if (!Patterns.PHONE.matcher(telefono).matches()) {
                    til.setError("Teléfono inválido");
                } else {
                    til.setError(null);
                }
        }

        if (view.getId()==anterior.getId()){
            //Intent intento1 = new Intent(view.getContext(), MainActivity8.class);
            //startActivity(intento1);
        }

    }
}