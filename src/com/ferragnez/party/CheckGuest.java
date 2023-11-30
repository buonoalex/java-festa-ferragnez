package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        //Apro scan
        Scanner myScanBro = new Scanner(System.in);

        int numberOfGuess = 11;

        Guess[] guessList = new Guess[numberOfGuess];

        //Alternativa
        String listCompleteGuess2 = "Dua Lipa,Paris Hilton,Manuel Agnelli,J-Ax,Francesco Totti,Ilary Blasi,Bebe Vio,Luis,Pardis Zarei,Martina Maccherone,Rachel Zeilic";

        String[] arrayGuess2 = listCompleteGuess2.split(",");

        for (int i = 0; i < guessList.length; i++) {
            if(arrayGuess2[i].indexOf(" ") == -1){
                String soloname = arrayGuess2[i];
                guessList[i] = new Guess();
                guessList[i].setName(soloname);
            }else{
                int posizioneSpazio = arrayGuess2[i].indexOf(" ");
                String name = arrayGuess2[i].substring(0,posizioneSpazio);
                String surname = arrayGuess2[i].substring(posizioneSpazio+1, arrayGuess2[i].length());
                guessList[i] = new Guess(name,surname);
            }
            guessList[i].PrintGuess();
        }

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

