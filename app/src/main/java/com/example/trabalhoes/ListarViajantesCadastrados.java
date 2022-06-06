package com.example.trabalhoes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.ArrayList;



public class ListarViajantesCadastrados  extends AppCompatActivity {

    private DatabaseReference databaseReference;



    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.viajantes_cdastrados);
        ListView listView = (ListView) findViewById(R.id.listview);
        final ArrayList<String> viajantes = new ArrayList<String>();
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,viajantes);
        databaseReference = FirebaseDatabase.getInstance().getReference().child("viajantes");


        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Bundle bundle = new Bundle();
                Log.d("passar",viajantes.get(position));
                bundle.putString("IdViajante", viajantes.get(position).toString());
                Intent intent = new Intent(ListarViajantesCadastrados.this, MenuViajante.class);

                intent.putExtras(bundle);
                startActivity(intent);


                }
            });





        databaseReference.addChildEventListener(new ChildEventListener() {

            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Viajante viajante = dataSnapshot.getValue(Viajante.class);



                viajantes.add("id = "+viajante.id);

                arrayAdapter.notifyDataSetChanged();
            }


            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }


            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }


            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }


            public void onCancelled(DatabaseError databaseError) {

            }
        });





    }
}
