package com.example;

import com.example.Studente;
import java.util.ArrayList;

public class Tutor {

    private String nome;
    private String cognome;
    private String codiceFiscale;
    ArrayList<Studente> studenti;

    public Tutor(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.studenti = new ArrayList<Studente>();
    }

    public boolean aggiungiStudente(Studente s) {
        if (isPresente(s)) {
            System.out.println("studente gia presente");
            return false;
        } else {
            studenti.add(s);
            return true;
        }
    }

    public boolean isPresente(Studente s) {
        boolean presente = false;
        for (int i = 0; i < studenti.size(); i++) {
            if (studenti.get(i).getMatricola() == s.getMatricola()) {
                presente = true;
            }
        }
        return presente;
    }

    public boolean rimuoviStudente(int indice) {
        if (indice <= 0 || indice > studenti.size()) {
            return false;
        }
        studenti.remove(indice);
        return true;
    }

    public int contaCognome() {
        int contatore = 0;
        for (int i = 0; i < studenti.size(); i++) {
            if (studenti.get(i).getCognome().startsWith("nap") || studenti.get(i).getCognome().startsWith("Nap")) {
                contatore++;
            }
        }
        return contatore;
    }

    public ArrayList<Studente> getDicembre() {
        ArrayList<Studente> studentiDicembre = new ArrayList<Studente>();

        for (int i = 0; i < studenti.size(); i++) {
            if (studenti.get(i).getDataDiNascita().charAt(3) == '1'
                    && studenti.get(i).getDataDiNascita().charAt(4) == '2') {
                Studente s1;
                s1 = new Studente(studenti.get(i).getNome(), studenti.get(i).getCognome(),
                        studenti.get(i).getDataDiNascita());
                studentiDicembre.add(s1);
            }
        }
        return studentiDicembre;
    }

    public int contaNome() {
        int contatore = 0;
        for (int i = 0; i < studenti.size(); i++) {
            if (studenti.get(i).getNome().contains("al")) {
                contatore++;
            }
        }
        return contatore;
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

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public int numeroStudenti() {
        return studenti.size();
    }

    
    public String toString() {
            return "Nome: " + nome + " Cognome: " + cognome + " Codice Fiscale: " + codiceFiscale;
        }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

}
