package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
    }

    @Override
    public void onClick(View view) {

        /** startActivity(new Intent(this, MainActivity2.class)); **/

        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}