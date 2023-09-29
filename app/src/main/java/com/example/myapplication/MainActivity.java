package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2;
    TextView texto;
    String mensaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        texto = findViewById(R.id.texto);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }


        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(i);
            }


        });


        Intent intent = getIntent();
        if (intent != null) {
            mensaje = getIntent().getStringExtra("mensaje");
            texto.setText(mensaje);
        }


        int colorDeFondo = getIntent().getIntExtra("ColorDeFondo", Color.WHITE);

        View rootView = findViewById(R.id.padre);
        rootView.setBackgroundColor(colorDeFondo);

    }

    @Override
    public void onClick(View view) {

    }
}