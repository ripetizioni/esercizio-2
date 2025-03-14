package com.example;

public class Studente {
    private int matricola;
    private String nome;
    private String cognome;   
    private String dataDiNascita; 
    private static int contatore=1;

    public Studente(String nome, String cognome, String data_di_nascita){
        this.nome=nome;
        this.cognome=cognome;
        this.matricola=contatore;
        this.dataDiNascita=data_di_nascita;
        contatore++;        
    }

    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+" Cognome: "+cognome+" Matricola: "+matricola;
    }
    
    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
