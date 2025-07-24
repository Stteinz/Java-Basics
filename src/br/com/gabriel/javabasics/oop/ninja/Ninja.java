package br.com.gabriel.javabasics.oop.ninja;

public class Ninja {
    String name;
    int age;
    String village;

    public void activateSharingan(){
        System.out.println("Sharingan is activated");
    }

    public String imANinja() {
        return "Hi, I'm a ninja";
    }

    public int yearsToBeAHokage(int minimumAgeToBeHokage){
        return minimumAgeToBeHokage - age;
    }
}
