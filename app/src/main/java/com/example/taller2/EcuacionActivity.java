package com.example.taller2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class EcuacionActivity extends AppCompatActivity {

    EditText inputA, inputB, inputC;
    Button btnCalcular;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion);

        inputA = findViewById(R.id.inputA);
        inputB = findViewById(R.id.inputB);
        inputC = findViewById(R.id.inputC);
        btnCalcular = findViewById(R.id.btnCalcular);
        resultado = findViewById(R.id.resultadoEcuacion);

        btnCalcular.setOnClickListener(v -> {
            double a = Double.parseDouble(inputA.getText().toString());
            double b = Double.parseDouble(inputB.getText().toString());
            double c = Double.parseDouble(inputC.getText().toString());

            double discriminante = b * b - 4 * a * c;
            if (discriminante >= 0) {
                double r1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double r2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                resultado.setText("Raíces reales:\n x1 = " + String.format("%.3f", r1) + "\n x2 = " + String.format("%.3f", r2));
            } else {
                double real = -b / (2 * a);
                double imag = Math.sqrt(-discriminante) / (2 * a);
                resultado.setText("Raíces complejas:\n x1 = " + String.format("%.3f", real) + " + " + String.format("%.3f", imag) + "i" +
                        "\n x2 = " + String.format("%.3f", real) + " - " + String.format("%.3f", imag) + "i");
            }
        });
    }
}
