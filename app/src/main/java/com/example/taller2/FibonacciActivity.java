package com.example.taller2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FibonacciActivity extends AppCompatActivity {

    EditText inputNumero;
    Button btnEjecutar;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        inputNumero = findViewById(R.id.inputNumero);
        btnEjecutar = findViewById(R.id.btnEjecutar);
        resultado = findViewById(R.id.resultadoFibonacci);

        btnEjecutar.setOnClickListener(v -> {
            int n = Integer.parseInt(inputNumero.getText().toString());
            StringBuilder serie = new StringBuilder();
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                serie.append(a).append(" ");
                int temp = a + b;
                a = b;
                b = temp;
            }
            resultado.setText(serie.toString());
        });
    }
}
