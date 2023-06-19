package com.example.dam_uc3_carlosaquino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnRegistrar;
        btnRegistrar = findViewById(R.id.btnRegistrate);
        btnRegistrar.setOnClickListener(view -> Toast.makeText(this,"Se envio sus datos",Toast.LENGTH_LONG).show());
    }
}