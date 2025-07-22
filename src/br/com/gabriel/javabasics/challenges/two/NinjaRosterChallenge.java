package br.com.gabriel.javabasics.challenges.two;

import java.util.Scanner;

public class NinjaRosterChallenge {
    public static void main(String[] args) {
        /**
         * Solution for Challenge 2 from the Java 10x course.
         *
         * CHALLENGE DESCRIPTION:
         * The Hokage has tasked you with managing the ninja roster for the Leaf Village.
         * Your mission is to create a simple Java system to register new ninjas and
         * list all registered ninjas.
         *
         * FUNCTIONAL REQUIREMENTS:
         * 1. Register Ninja: Allow the user to add a new ninja's name to the roster.
         * 2. List Ninjas: Display all currently registered ninjas.
         * 3. Exit: Allow the user to close the application at any time.
         *
         * TECHNICAL REQUIREMENTS:
         * - The program must use an interactive menu.
         * - Arrays: To store the ninja names.
         * - Switch Cases: To handle the menu options.
         * - Loops: To keep the menu running and to iterate through the ninja list.
         * - Conditionals: To control the program flow (e.g., checking if the roster is full).
         *
         * @author Gabriel Lacerda
         * @version 1.0
         * @since 2025-07-21
         */

        final int MAX_NINJAS = 10;
        String[] ninjas = new String[MAX_NINJAS];
        int ninjaCounter = 0;
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===Ninja Roster - Leaf Village===");
            System.out.println("What do you want to do?");
            System.out.println("1. Register a Ninja");
            System.out.println("2. Display the list of all registered ninjas.");
            System.out.println("3. Finish");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    if (ninjaCounter < MAX_NINJAS) {
                        System.out.print("What is the Ninja's name?: ");
                        String ninjaName = input.nextLine();
                        ninjas[ninjaCounter] = ninjaName;
                        ninjaCounter++;
                        System.out.println("Ninja registered successfully!");
                    } else {
                        System.out.println("The list of ninjas is full, impossible to register a new ninja.");
                    }
                    break;
                case 2:
                    if (ninjaCounter == 0) {
                        System.out.println("Ninja roster is empty.");
                    } else {
                        System.out.println("--- Registered Ninjas ---");
                        for (int i = 0; i < ninjaCounter; i++) {
                            System.out.println("- " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        } while (choice != 3);

        input.close();
        System.out.println("Program finished.");
    }
}

