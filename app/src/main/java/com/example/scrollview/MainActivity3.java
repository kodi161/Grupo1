package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    Button anterior;
    Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        anterior=findViewById(R.id.banterior3);
        siguiente=findViewById(R.id.bsiguiente3);

        anterior.setOnClickListener(this);
        siguiente.setOnClickListener(this);
        /**EN EL ARRAYADAPTER REFERENCIAMOS A UN DOCUMENTO XML QUE FORMA PARTE DEL SISTEMA OPERATIVO ANDROID (simple_dropdown_item_1line)
         * Y LLAMAMOS AL ARRAY EL CUAL DECLARAMOS MÁS ADELANTE*/
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, CIUDADES);
        AutoCompleteTextView textView = findViewById(R.id.autoCompleteTextView);

        /**SETTEAMOS EL ARRAY ADAPTER ANTERIORMENTE DECLARADO*/
        textView.setAdapter(adaptador);
    }

    /**CREAMOS UN ARRAY EL CUAL CONTENGA EL NOMBRE DE LAS CIUDADES PARA QUE SE AUTOCOMPLETEN*/
    private static final String[] CIUDADES = new String[] {
            "Praga", "Petra", "Roma", "Kioto", "Sevilla"
    };
    public void onClick(View view) {
        if (view.getId()==anterior.getId()){
            Intent intento1 = new Intent(view.getContext(), MainActivity2.class);
            startActivity(intento1);
        }
        if (view.getId()==siguiente.getId()){
            Intent intento2 = new Intent(view.getContext(), MainActivity9.class);
            startActivity(intento2);
        }
    }
}