package com.example.trabalhoes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VizualizarDivida extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.vizualizar_divida);

        final Intent intent = getIntent();
        Bundle dados = intent.getExtras();

        Button voltar = (Button) findViewById(R.id.ok);

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                finish();

            }
        });
    }
}
