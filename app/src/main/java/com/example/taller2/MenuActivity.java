package com.example.taller2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    Button btnFibonacci, btnEcuacion, btnOrdenar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnFibonacci = findViewById(R.id.btnFibonacci);
        btnEcuacion = findViewById(R.id.btnEcuacion);
        btnOrdenar = findViewById(R.id.btnOrdenar);

        btnFibonacci.setOnClickListener(v -> startActivity(new Intent(this, FibonacciActivity.class)));
        btnEcuacion.setOnClickListener(v -> startActivity(new Intent(this, EcuacionActivity.class)));
        btnOrdenar.setOnClickListener(v -> startActivity(new Intent(this, OrdenarActivity.class)));
    }
}
