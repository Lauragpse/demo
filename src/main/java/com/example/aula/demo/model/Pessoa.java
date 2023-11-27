package com.example.aula.demo.model;

public class Pessoa {
    private String nome;
    private String telefone;
    private int id;
    
    /*construtor do objeto pessoa*/
    public Pessoa ( String nome, String telefone, int id) {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setId(id);
    }

    public Pessoa(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

