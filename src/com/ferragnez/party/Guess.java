package com.ferragnez.party;

public class Guess {

    private String name;
    private String surname;
    private int age;

    //Costrutture Personale
    public Guess(String name, String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //Stampa Guess(Function)
    public void PrintGuess(Guess guess){
        System.out.println("Name : "+guess.name+" Surname : "+guess.surname+" Age : "+guess.age);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
