package br.com.gabriel.javabasics.oop.ninja;

public class MainNinja {
    public static void main(String[] args) {

        //Create Naruto
        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto Uzumaki";
        naruto.age = 18;
        naruto.village = "Leaf Village";
        naruto.sageMode();

        //Crate Sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchiha";
        sasuke.age = 19;
        sasuke.village = "Leaf Village";
        sasuke.sharingan();
        String methodCall = sasuke.imANinja();
        System.out.println(methodCall);
        int howMuchTimeIsLeft = sasuke.yearsToBeAHokage(50);
        System.out.println("Sasuke is " + sasuke.age + " years old, so there are at least " + howMuchTimeIsLeft + " years to be a Hokage");

        //Create Hinata
        Hyuuga hinata = new Hyuuga();
        hinata.name = "Hinata Hyuuga";
        hinata.age = 19;
        hinata.village = "Leaf Village";
        hinata.byakugan();

        //Create Boruto
        Boruto boruto = new Boruto();
        boruto.name = "Boruto Hyuuga Uzumaki";
        boruto.age = 9;
        boruto.village = "Leaf Village";

        boruto.sageMode();
        boruto.ActivateKarma();
        boruto.ActivateJougan();
    }
}
