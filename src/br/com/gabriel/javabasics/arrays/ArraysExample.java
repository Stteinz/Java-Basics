package br.com.gabriel.javabasics.arrays;

public class ArraysExample {
    public static void main(String[] args) {

        String [] ninja = new String[3];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura haruno";

        for( int i = 0; i < ninja.length; i++ ) {
            System.out.println( ninja[i]);
        }
    }
}
