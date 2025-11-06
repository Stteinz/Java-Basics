package br.com.gabriel.javabasics.oop.ninja.constructor;

public class Main {
    public static void main(String[] args) {

        Hokage Hashirama =  new Hokage();
        Hashirama.idade = 45;

        Hokage Tobirama = new Hokage("Tobirama Senju");

        Hokage Hiruzem = new Hokage(40);

        Hokage Minato = new Hokage("Minato Namikaze",32,false);
    }
}
