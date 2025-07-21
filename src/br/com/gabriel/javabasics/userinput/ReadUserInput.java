package javabasics.userinput;

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        //Open the Scanner
        Scanner input = new Scanner(System.in);

        //Receive Ninja's name
        System.out.println("Write here the Ninja's name: ");
        String name = input.nextLine();
        System.out.println("The ninja's name is: " + name);

        //Receive Ninja's age
        System.out.println("Write here the Ninja's age: ");
        int age = input.nextInt();
        input.nextLine(); // Consumes the leftover newline character from the input buffer
        System.out.println("The ninja's age is: " + age + " years old");

        if(age >= 18){
            System.out.println(name + " is an adult");
        } else {
            System.out.println(name + " is underage");
        }

        //Always close the Scanner
        input.close();
    }
}
