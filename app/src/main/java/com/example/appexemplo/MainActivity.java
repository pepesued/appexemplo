package com.example.appexemplo;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText salario;
    private RadioButton b40;
    private RadioButton b45;
    private RadioButton b50;
    private Button calcular;
    private double aumento;
    double res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salario = findViewById(R.id.valor);
        b40 = findViewById(R.id.b1);
        b45 = findViewById(R.id.b2);
        b50 = findViewById(R.id.b3);
        calcular = findViewById(R.id.calc);


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),resultado.class);


                res = Double.parseDouble(salario.getText().toString());

                if(b40.isChecked()){
                    aumento = (40/100)*res;
                    i.putExtra("valor","O salario reajustado a 40% é: "+(aumento+res));


                }
                else{
                    if(b45.isChecked()){
                        aumento = (45/100)*res;
                        i.putExtra("valor","O salario reajustado a 45% é: "+(aumento+res));

                    }
                    else{
                        if(b50.isChecked()){
                            aumento = (50/100)*res;
                            i.putExtra("valor","O salario reajustado a 50% é: "+(aumento+res));

                        }
                        startActivity(i);
                    }


                }


                }
    });
}}
