package com.example;

import java.util.ArrayList;

public class Libreria {
    
    private String nome;
    private ArrayList<Libro>libri;

    public Libreria(String nome) {
        this.nome = nome;
        this.libri = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Libro> getLibri() {
        return libri;
    }

    @Override
    public String toString() {
        return "Libreria{" + "nome=" + nome + ", libri=" + libri + '}';
    }

    public void aggiungiLibro(Libro l)
    {
        libri.add(l);
    }
    
}
