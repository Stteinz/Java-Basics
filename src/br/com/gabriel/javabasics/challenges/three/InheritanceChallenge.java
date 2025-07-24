package br.com.gabriel.javabasics.challenges.three;

import java.util.Scanner;

/**
 * Solution for Challenge 3 from the Java 10x course.
 *
 * CHALLENGE DESCRIPTION:
 * Create a Java program to manage ninja information using inheritance.
 * Develop a base class named Ninja and a subclass named Uchiha.
 *
 * REQUIREMENTS:
 * 1.  Ninja Class:
 * - Define the attributes: `name` (String), `age` (int), `mission` (String),
 * `difficultyLevel` (String), and `missionStatus` (String).
 * - Add a method called `displayInformation()` that prints all these
 * attributes.
 *
 * 2.  Uchiha Class:
 * - Create a subclass named `Uchiha` that inherits from `Ninja`.
 * - Add an additional attribute: `specialAbility` (String).
 * - Add a method called `displaySpecialAbility()` to print the special
 * ability.
 *
 * 3.  Method Overriding:
 * - Override the `displayInformation()` method in the `Uchiha` class
 * to also include the `specialAbility`.
 *
 * EXTRA CHALLENGE:
 * - Implement an interactive menu using the Scanner class to allow the user
 * to choose between different options, such as displaying information for all
 * ninjas, adding new ninjas, or updating special abilities.
 *
 * @author Gabriel Lacerda
 * @version 1.0
 * @since 2025-07-24
 */

public class InheritanceChallenge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int MAX_NINJAS = 10;
        Ninja[] ninjas = new Ninja[MAX_NINJAS];
        int ninjaCounter = 0;
        int choice;

        do {
            System.out.println("\n=== Uchiha Menu ===");
            System.out.println("1. Create a Uchiha");
            System.out.println("2. Show all Ninja's info");
            System.out.println("3. Add a new Ninja (Generic)");
            System.out.println("4. Update special abilities (Not implemented)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    if (ninjaCounter < MAX_NINJAS) {
                        System.out.println("--- Creating a Uchiha ---");
                        Uchiha newUchiha = new Uchiha();

                        System.out.print("What is the Uchiha's name? ");
                        newUchiha.name = input.nextLine();

                        System.out.print("What is the Uchiha's age? ");
                        newUchiha.age = input.nextInt();
                        input.nextLine();

                        System.out.print("What is the mission? ");
                        newUchiha.mission = input.nextLine();

                        System.out.print("What is the difficulty level? ");
                        newUchiha.difficultyLevel = input.nextLine();

                        System.out.print("What is the Uchiha's special ability? ");
                        newUchiha.specialAbility = input.nextLine();

                        newUchiha.missionStatus = "In Progress";

                        ninjas[ninjaCounter] = newUchiha;
                        ninjaCounter++;
                        System.out.println("Uchiha registered successfully!");
                    } else {
                        System.out.println("Roster is full. Cannot register more ninjas.");
                    }
                    break;
                case 2:
                    System.out.println("--- All Registered Ninjas ---");
                    if (ninjaCounter == 0) {
                        System.out.println("No ninjas registered yet.");
                    } else {
                        for (int i = 0; i < ninjaCounter; i++) {
                            System.out.println("\n--- Ninja " + (i + 1) + " ---");
                            ninjas[i].showInfo();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Functionality not implemented yet.");
                    break;
                case 4:
                    System.out.println("Functionality not implemented yet.");
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (choice != 5);

        input.close();
        System.out.println("Program finished.");
    }
}
