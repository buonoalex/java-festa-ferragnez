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
