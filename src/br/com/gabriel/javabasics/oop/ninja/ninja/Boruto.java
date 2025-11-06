package br.com.gabriel.javabasics.oop.ninja.ninja;

public class Boruto extends Uzumaki implements HyuugaUzumaki {

    @Override
    public void ActivateKarma() {
        System.out.println("Karma is activated");
    }

    @Override
    public void ActivateJougan() {
        System.out.println("Jougan is activated");
    }
}
