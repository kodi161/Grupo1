package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox casilla;
    TextView tv1;
    Button banterior;
    Button bsiguiente;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        casilla=findViewById(R.id.checkBox);
        tv1=findViewById(R.id.tv1);
        banterior=findViewById(R.id.banterior);
        bsiguiente=findViewById(R.id.bsiguiente);


        casilla.setOnClickListener(this);
        banterior.setOnClickListener(this);
        bsiguiente.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==banterior.getId()){
            //Intent intento1 = new Intent(view.getContext(), MainActivity2.class);
            //startActivity(intento1);
        }
        if (view.getId()==bsiguiente.getId()){
            Intent intento2 = new Intent(view.getContext(), MainActivity2.class);
            startActivity(intento2);
        }
        if (view.getId()==casilla.getId()){
            if (casilla.isChecked()){
                tv1.setText("Se ha marcado la casilla");
            }else{
                tv1.setText("No se marcado la casilla");
            }
        }
    }
}