package com.ferragnez.party;

public class Guess {

    private String name;
    private String surname;

    //Costrutture Personale
    public Guess(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Guess(){

    }

    //Stampa Guess(Function)
    public void PrintGuess(){
        System.out.println("Name : "+this.name+" Surname : "+this.surname);
    }

    //Metodo equals
    @Override
    public boolean equals(Object oggetto) {
        Guess guess;
        if (oggetto instanceof Guess){
            guess = (Guess) oggetto;
        }else {
            return false;
        }
        if (this == guess){
            return true;
        }
        //Add control
        String parolaName1 = this.name.toLowerCase();
        String parolaName2 = guess.getName().toLowerCase();
        String parolaSurname1 = this.surname.toLowerCase();
        String parolaSurname2 = guess.surname.toLowerCase();
        if (parolaName1.equals(parolaName2) && parolaSurname1.equals((parolaSurname2))){
            return true;
        }else {
            return false;
        }
    }

    //Get e Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
