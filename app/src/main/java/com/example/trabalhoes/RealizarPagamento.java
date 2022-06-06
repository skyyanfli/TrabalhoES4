package com.example.trabalhoes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RealizarPagamento extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.realizar_pagamento);

        Button ok = (Button) findViewById(R.id.ok);
        Button voltar = (Button) findViewById(R.id.voltar);


        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    finish();
            }
        });
        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                finish();

            }
        });
    }
}
