package com.ferragnez.party;

import java.util.Objects;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        //Apro scan
        Scanner myScanBro = new Scanner(System.in);

        Guess[] guessList = new Guess[11];

        //Completamento array da stringa
        String listCompleteGuess = "Dua,Lipa,Paris,Hilton,Manuel,Agnelli,Alessandro,Aleotti,Francesco,Totti,Ilary,Blasi,Bebe,Vio,Sergio,Lerme,Pardis,Zarei,Martina,Maccherone,Rachel,Zeilic";


        //Riempimemto
        String[] arrayGuess = listCompleteGuess.split(",");

        for (int i = 0, j = 0; i < guessList.length; i++, j = j + 2) {
            guessList[i] = new Guess();
            guessList[i].setName(arrayGuess[j]);
            guessList[i].setSurname(arrayGuess[j + 1]);
        }

        //Stampo Array
        System.out.println("----------------------");
        System.out.println("Ecco la Lista degli ospiti che posso entrare : \n");

        for (int i = 0; i < guessList.length; i++) {
            guessList[i].PrintGuess();
        }

        System.out.println("-----------------------");

        //Input Utente
        Guess guessToFind = new Guess();
        String nameGuess;
        System.out.println("Inserisci il nome del tuo ospite : ");
        guessToFind.setName(myScanBro.nextLine());

        String surnameGuess;
        System.out.println("Inserisci il cognome del tuo ospite : ");
        guessToFind.setSurname(myScanBro.nextLine());

        boolean sentinella = false;
        for (int i = 0; i < guessList.length && !sentinella ; i++) {
            if (guessToFind.equals(guessList[i])){
                sentinella = true;
            }
        }

        if (sentinella){
            System.out.println("PREGO puoi entrare");
        }else {
            System.out.println("NON puoi entrare");
        }


        //Chiudo scan
        myScanBro.close();
    }

}

