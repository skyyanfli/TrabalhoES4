package com.example.trabalhoes;
import com.google.firebase.database.DatabaseReference;


public class Viajante {
    public String nome;
    public String idade;
    public String qviagens;
    public String id;
    public Viajante() {

    }

    public Viajante(String id,String nome,String idade,String qviagens) {
        this.nome = nome;
        this.idade = idade;
        this.qviagens = qviagens;
        this.id = id;
    }




}
