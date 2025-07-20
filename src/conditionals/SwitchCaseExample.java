package conditionals;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validChoice = false;

        do {
            System.out.println("Choose your Ninja: ");
            System.out.println("1- Naruto Uzumaki");
            System.out.println("2- Sasuke Uchiha");
            System.out.println("3- Sakura haruno");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You chose Naruto Uzumaki");
                    validChoice = true;
                    break;
                case 2:
                    System.out.println("You chose Sasuke Uchiha");
                    validChoice = true;
                    break;
                case 3:
                    System.out.println("You chose Sakura haruno");
                    validChoice = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
        } while (!validChoice);
        System.out.println("Great choice! Program finished");
        input.close();
    }
}
