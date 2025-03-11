package com.example;

public class Libro {
    
    private String titolo;
    private String autore;
    private int anno;
    private String genere;

    public Libro(String titolo, String autore, int anno, String genere) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.genere = genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titolo=" + titolo + ", autore=" + autore + ", anno=" + anno + ", genere=" + genere + '}';
    }

}
