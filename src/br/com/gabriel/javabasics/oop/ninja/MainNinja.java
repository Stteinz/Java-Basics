package br.com.gabriel.javabasics.oop.ninja;

public class MainNinja {
    public static void main(String[] args) {

        //Create Naruto
        Ninja naruto = new Ninja();
        naruto.name = "Naruto Uzumaki";
        naruto.age = 18;
        naruto.village = "Leaf Village";

        //Crate Sasuke
        Ninja sasuke = new Ninja();
        sasuke.name = "Sasuke Uchiha";
        sasuke.age = 19;
        sasuke.village = "Leaf Village";

        //Create Sakura
        Ninja sakura = new Ninja();
        sakura.name = "Sakura Haruno";
        sakura.age = 19;
        sakura.village = "Leaf Village";
    }
}
