package com.example.trabalhoes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class RealizarEmbarque extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.realizar_embarque);
        final Intent intent = getIntent();
        Bundle dados = intent.getExtras();

        Button ok = (Button) findViewById(R.id.ok);
        Button voltar = (Button) findViewById(R.id.ok);
        final CheckBox retornar = (CheckBox) findViewById(R.id.retornar);



        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(retornar.isChecked()){

                    finish();

                }else{

                    finish();

                }

            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                finish();



            }
        });

    }
}
