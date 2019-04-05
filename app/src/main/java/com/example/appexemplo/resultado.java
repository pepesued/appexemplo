package com.example.appexemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

public class resultado extends AppCompatActivity {
    private TextView idResultado;
    private Button retornar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        idResultado = findViewById(R.id.resultado);
        retornar = findViewById(R.id.voltar);

        Bundle dados = getIntent().getExtras();
        idResultado.setText(dados.getString("valor"));


        retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
