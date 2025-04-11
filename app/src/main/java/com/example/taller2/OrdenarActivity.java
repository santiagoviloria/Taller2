package com.example.taller2;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.util.*;

public class OrdenarActivity extends AppCompatActivity {

    EditText inputNumeros;
    RadioButton rbAsc, rbDesc;
    Button btnOrdenar;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordenar);

        inputNumeros = findViewById(R.id.inputNumeros);
        rbAsc = findViewById(R.id.rbAscendente);
        rbDesc = findViewById(R.id.rbDescendente);
        btnOrdenar = findViewById(R.id.btnOrdenar);
        resultado = findViewById(R.id.resultadoOrdenar);

        btnOrdenar.setOnClickListener(v -> {
            String[] nums = inputNumeros.getText().toString().split(",");
            List<Integer> lista = new ArrayList<>();
            for (String n : nums) {
                lista.add(Integer.parseInt(n.trim()));
            }
            if (rbAsc.isChecked()) {
                Collections.sort(lista);
            } else if (rbDesc.isChecked()) {
                Collections.sort(lista, Collections.reverseOrder());
            }
            resultado.setText("Ordenado: " + lista.toString());
        });
    }
}
