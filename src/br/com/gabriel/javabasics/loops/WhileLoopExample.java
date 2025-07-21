package javabasics.loops;

public class WhileLoopExample {
    public static void main(String[] args) {
        int numberOfClones = 0;
        int maximumNumberOfClones = 10;

        while (numberOfClones < maximumNumberOfClones){
            numberOfClones++;
            System.out.println("Naruto made " + numberOfClones + " clones");
        }
    }
}
