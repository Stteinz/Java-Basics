package br.com.gabriel.javabasics.oop.ninja.ninja;

public class Ninja {
    String name;
    int age;
    String village;

    public String imANinja() {
        return "Hi, I'm a ninja";
    }

    public int yearsToBeAHokage(int minimumAgeToBeHokage){
        return minimumAgeToBeHokage - age;
    }
}
