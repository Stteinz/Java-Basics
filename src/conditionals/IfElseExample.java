package conditionals;

public class IfElseExample {
    public static void main(String[] args) {

        /*
         * If Else - Conditions
         * Level up the ninja according to the number of missions.
         **/

        String name = "Naruto";
        int age = 16;
        short numberOfMissions = 25;

        boolean canBePromoted = numberOfMissions > 15 && age > 15;

        if (canBePromoted) {
            System.out.println(name + " is ready to level up!");
        } else {
            System.out.println(name + " is not ready to level up. Get more missions and try again.");
        }

        String finalRank;

        if (numberOfMissions >= 20 && canBePromoted) {
            finalRank = "Jounin";
        } else if (canBePromoted) {
            finalRank = "Chuunin";
        } else {
            finalRank = "Gennin";
        }

        System.out.println("Current Rank: " + finalRank);
    }
}