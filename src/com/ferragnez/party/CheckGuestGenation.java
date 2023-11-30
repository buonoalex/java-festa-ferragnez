package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestGenation {
    public static void main(String[] args) {
        //Apertura Scanner
        Scanner myScanBro = new Scanner(System.in);

        String listGuessComplete = "Dua Lipa,Paris Hilton,Manuel Agnelli,J-Ax,Francesco Totti,Ilary Blasi,Bebe Vio,Luis,Pardis Zarei,Martina Maccherone,Rachel Zeilic";

        String[] arrayGuessList = listGuessComplete.toLowerCase().split(",");

        //Input
        String searchVip;
        System.out.println("Inserisci il Vip da cercare : ");
        searchVip = myScanBro.nextLine();

        //Per Lowercase sensitive
        String searchVipFormat = searchVip.toLowerCase();


        /*Confronto con for (Funziona)
        boolean sentinella = false;
        for (int i = 0; i < arrayGuessList.length && !sentinella; i++) {
            if (searchVip.equals(arrayGuessList[i])){
                sentinella = true;
            }
        }

         */

        //Confronto con while (Funziona)
        boolean sentinella = false;
        int i = 0;
        while (i < arrayGuessList.length && !sentinella){
            if(searchVipFormat.equals(arrayGuessList[i])){
                sentinella = true;
            }
            i++;
        }

        if (sentinella){
            System.out.println("Bravo il Vip "+searchVip+" può entrare ");
        }else {
            System.out.println("Mi dispiace "+searchVip+" NON può entrare ");
        }

        //Chiusura Scanner
        myScanBro.close();

    }
}
