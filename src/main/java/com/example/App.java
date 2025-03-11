package com.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Inserisci nome libreria: ");
        String nome_libreria=input.nextLine();
        Libreria libreria=new Libreria(nome_libreria);

        for(int i=0;i<5;i++)
        {
            System.out.println("inserisci nome libro: ");
            String nome_libro=input.nextLine();
            System.out.println("Inserisci nome autore: ");
            String nome_autore=input.nextLine();
            System.out.println("Inserisci anno di produzione: ");
            int anno_produzione=input.nextInt();
            input.nextLine();
            System.out.println("Inserisci genere: ");
            String genere=input.nextLine();
            Libro libro=new Libro(nome_libro,nome_autore,anno_produzione,genere);
            libreria.aggiungiLibro(libro);
        }
        {
            int i=0;
            while(i<5)
            {
                System.out.println(libreria.getLibri().get(i).toString());
                i++;
            }
        }
        
        
    }
}
