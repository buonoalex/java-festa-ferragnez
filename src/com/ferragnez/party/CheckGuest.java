package com.ferragnez.party;

import java.util.Arrays;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        //Apro scan
        Scanner myScanBro = new Scanner(System.in);

        Guess[] guessList = new Guess[10];

        //Completamento array da stringa
        String listCompleteGuess = "Dua,Lipa,Paris,Hilton,Manuel,Agnelli,Alessandro,Aleotti,Francesco,Totti,Ilary,Blasi,Bebe,Vio,Sergio,Lerme,Pardis,Zarei,Martina,Maccherone,Rachel,Zeilic";


        //Riempimemto
        String[] arrayGuess = listCompleteGuess.split(",");

        boolean sentinella = false;
        for (int i = 0; i < guessList.length && !sentinella; i++) {
            guessList[i] = new Guess();
            for (int j = 0; j < (guessList.length*2)+1 ; j=j+2) {
                guessList[i].setName(arrayGuess[j]);
                guessList[i].setSurname(arrayGuess[j+1]);
                guessList[i].PrintGuess();
            }
            sentinella = true;
        }

        //Input Utente





        //Chiudo scan
        myScanBro.close();
    }
}
