package com.example;

public class App {

    public static void main(String[] args) {
        Tutor tutor = new Tutor("Paolo", "Rossi", "RSSPLA01A01H501A");
        Studente studente1 = new Studente("Luca", "Bianchi", "15/07/2001");
        Studente studente2 = new Studente("Mario", "naponsi", "17/12/2001");
        Studente studente3 = new Studente("Naplo", "Guida", "07/05/2001");
        System.out.println(tutor.aggiungiStudente(studente1));
        System.out.println(tutor.aggiungiStudente(studente2));
        System.out.println(tutor.aggiungiStudente(studente3));
        System.out.println(tutor.aggiungiStudente(studente1));
        System.out.println(tutor.numeroStudenti());
        System.out.println(tutor.rimuoviStudente(2));
        System.out.println(tutor.getDicembre());
        System.out.println(tutor.contaCognome());
        System.out.println(tutor.toString());

        for(int i=0; i<tutor.numeroStudenti();i++){
            System.out.println(tutor.getStudenti().get(i).toString());
        }


    
        
        
    }
}
