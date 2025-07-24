package br.com.gabriel.javabasics.challenges.three;

public class Uchiha extends Ninja{
    String specialAbility;

    public void showSpecialAbility(){
        System.out.println("Special Ability activated");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Special ability: " + specialAbility);
    }
}
