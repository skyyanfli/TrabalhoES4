package com.example.trabalhoes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuViajante extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.embarque_viajante);
        final Bundle bundle = new Bundle();
        final Intent intent = getIntent();
        Bundle dados = intent.getExtras();
        bundle.putString("IdViajante", dados.getString("IdViajante"));


        TextView textView = (TextView) findViewById(R.id.textView);
        Button embarque = (Button) findViewById(R.id.RealizarEmbarque);
        Button divida = (Button) findViewById(R.id.VizualizarDivida);
        Button pagamento = (Button) findViewById(R.id.RealizarPagamento);

        textView.setText(dados.getString("IdViajante"));


        embarque.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MenuViajante.this, RealizarEmbarque.class);
                intent.putExtras(bundle);
                startActivity(intent);



            }
        });

        divida.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MenuViajante.this, VizualizarDivida.class);
                intent.putExtras(bundle);
                startActivity(intent);




            }
        });

        pagamento.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MenuViajante.this, RealizarPagamento.class);
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });



    }
}
