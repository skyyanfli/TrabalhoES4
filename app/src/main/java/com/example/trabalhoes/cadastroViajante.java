package com.example.trabalhoes;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class cadastroViajante extends AppCompatActivity {

    boolean teste;
    private DatabaseReference mDatabase;// ...

    @Override
    public void onCreate(Bundle savedInstanceState) {



        mDatabase = FirebaseDatabase.getInstance().getReference();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastroviajante);


        final EditText login   = (EditText) findViewById(R.id.login);
        final EditText nome   = (EditText) findViewById(R.id.nome);
        final EditText idade   = (EditText)findViewById(R.id.idade);

        Button button = (Button) findViewById(R.id.ok);
        Button button2 = (Button) findViewById(R.id.retornar);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {



                String content = login.getText().toString();
                String content2 = nome.getText().toString();
                String content3 = idade.getText().toString();


                    if(!content.isEmpty()) {

                        writeNewUser(content, content2, content3, "");

                        getID(content);
                        finish();
                    }


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();

            }
        });
    }
    private void writeNewUser(String id, String username,String idade,String qviagens) {
        Viajante viajante = new Viajante(id,username,idade,qviagens);

        mDatabase.child("viajantes").child(id).setValue(viajante);

    }


    public void getID(final String id) {

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });


    }



}
