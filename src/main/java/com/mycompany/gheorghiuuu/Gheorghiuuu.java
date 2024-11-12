/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gheorghiuuu;

/**
 *
 * @author ospite
 */
import java.util.Scanner;


public class Gheorghiuuu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        System.out.println("EMANUELE GHEORGHIU: ");
        System.out.println("L'obbiettivo di questo programma e' svolgere la poitenza di un numero: ");
        System.out.println("INSERISCI L'ESPONENTE: ");
        // Creazione dello scanner per l'input dell'utente
        Scanner sc= new Scanner(System.in);
        // Richiede all'utente di inserire la base
        System.out.println("Inserisci la base");
        int b=sc.nextInt();
        // Richiede all'utente di inserire l'esponente
        System.out.println("Inserisci l'esponente");
        int e=sc.nextInt();
        int pot=1;
        // Ciclo for per calcolare la potenza
        for(int i=0;i<e;i++) {
        pot=pot*b;
        // Se l'esponente è zero imposta pot a 1
        if(e==0){
        pot=1;
        }          
        }
        // Stampa il risultato finale della potenza
        System.out.println("Il valore della potenza e'"+pot); 
        }
        }

