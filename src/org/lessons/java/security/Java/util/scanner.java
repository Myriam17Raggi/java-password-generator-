package org.lessons.java.security.Java.util;

//INPUT: variabili con nome, cognome, colore preferito e data di nascita
//OUTPUT: generare password che contiene: nome, cognome, colore preferito e data di nascita

import java.util.Scanner;

public class PasswordGenerator {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);

            // dichiaro le variabili
            String nameUtente;
            String surnameUtente;
            String favColor;

            int dayOfBirthy;
            int monthOfBirth;
            int yearOfBirth;

            //chiedere all'utente di inserire i dati
            System.out.println("Inserisci il tuo nome: ");
            nameUtente = scanner.nextLine();

            System.out.println("Inserisci il tuo cognome: ");
            surnameUtente = scanner.nextLine();

            System.out.println("Inserisci il tui colore preferito: ");
            favColor = scanner.nextLine();

            System.out.println("Inserisci il giorno del tuo compleanno: ");
            int dayOfBirth = scanner.nextInt();

            System.out.println("Inserisci il mese del tuo compleanno: ");
            int monthOfBirth = scanner.next();

            System.out.println("Inserisci l'anno del tuo compleanno: ");
            int yearOfBirth = scanner.next();

        }
    }
