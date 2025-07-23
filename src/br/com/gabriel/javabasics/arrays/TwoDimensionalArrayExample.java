package br.com.gabriel.javabasics.arrays;

public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        String ninjas[][] = new String[3][3];

        ninjas[0][0] = "Leaf Village";
        ninjas[0][1] = "Naruto Uzumaki";
        ninjas[0][2] = "Hinata Hyuga";

        ninjas[1][0] = "Village Hidden by Sand";
        ninjas[1][1] = "Gaara";
        ninjas[1][2] = "Temari";

        ninjas[2][0] = "Amegakure";
        ninjas[2][1] = "Nagato";
        ninjas[2][2] = "Konan";

        for (int i = 0; i < ninjas.length; i++) {
            for (int j = 0; j < ninjas[i].length; j++) {
                System.out.print(ninjas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
