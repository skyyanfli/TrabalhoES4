package com.example.trabalhoes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        final Bundle bundle = new Bundle();


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                                Intent i = new Intent(MainActivity.this, cadastroViajante.class);
                startActivity(i);



            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ListarViajantesCadastrados.class);
                intent.putExtras(bundle);
                startActivity(intent);




            }
        });




    }
}
