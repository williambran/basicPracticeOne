package com.example.practicabasicas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numEntero;
    private TextView resultado;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numEntero = findViewById(R.id.et_number);
        resultado = findViewById(R.id.tv_result);
        btnResult = findViewById(R.id.btn_sumatoria);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumatoria();
            }
        });
    }

    public void sumatoria(){
        String valor1 = numEntero.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int suma = nro1 * (nro1 +1) / 2;

        String result = "";
        result = "La suma de los " + nro1 + "primeros numeros es : " + suma;

        resultado.setText(result);
    }


}