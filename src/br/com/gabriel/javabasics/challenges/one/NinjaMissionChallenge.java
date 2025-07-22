package br.com.gabriel.javabasics.challenges.one;

/**
 * Solution for Challenge 1 from the Java 10x course.
 *
 * CHALLENGE DESCRIPTION:
 * Create a program that represents three ninjas from the Leaf Village (Konoha)
 * and their respective missions. Each ninja has a name, an age, and an
 * assigned mission, with the mission's name, difficulty level, and
 * completion status.
 *
 * EXTRA CHALLENGE:
 * - Ninjas under 15 can only complete C or D level missions.
 * - Ninjas 15 or older can complete missions of any level.
 *
 * @author Gabriel Lacerda
 * @version 1.0
 * @since 2025-07-16
 */

public class NinjaMissionChallenge {
    public static void main(String[] args) {

        // Ninja 1
        String ninja1 = "Naruto Uzumaki";
        int ageNinja1 = 14;
        String missionInfo1 = "Rescue a Cat";
        char mission1 = 'D';
        String statusNinja1 = "In progress";

        if(ageNinja1 < 15){
            if(mission1 == 'D' || mission1 == 'C'){
                statusNinja1 = "Completed the mission";
            } else{
                statusNinja1 = "Not completed, insufficient age";
            }
        } else {
            statusNinja1 = "Completed the mission";
        }

        System.out.println("===Ninja's Mission Challenge===");
        System.out.println("Ninja 1: " + ninja1);
        System.out.println("Ninja age: " + ageNinja1);
        System.out.println("Mission 1: " + missionInfo1);
        System.out.println("Mission Level: " + mission1);
        System.out.println("Mission Status: " + statusNinja1);

        System.out.println("================================");

        String ninja2 = "Sasuke Uchiha";
        int ageNinja2 = 14;
        String missionInfo2 = "Spy on the fog village";
        char mission2 = 'B';
        String statusNinja2 = "In progress";

        if(ageNinja2 < 15){
            if(mission2 == 'C' || mission2 == 'D'){
                statusNinja2 = "Completed the mission";
            } else {
                statusNinja2 = "Not completed, insufficient age";
            }
        } else {
            statusNinja2 = "Completed the mission";
        }

        System.out.println("Ninja 2: " + ninja2);
        System.out.println("Ninja age: " + ageNinja2);
        System.out.println("Mission 1: " + missionInfo2);
        System.out.println("Mission Level: " + mission2);
        System.out.println("Mission Status: " + statusNinja2);

        System.out.println("================================");

        String ninja3 = "Sakura Haruno";
        int ageNinja3 = 14;
        String missionInfo3 = "Heal people at the hospital";
        char mission3 = 'C';
        String statusNinja3;

        if (ageNinja3 < 15){
            if(mission3 == 'C' || mission3 == 'D'){
                statusNinja3 = "Completed the mission";
            } else  {
                statusNinja3 = "Not completed, insufficient age";
            }
        } else  {
            statusNinja3 = "Completed the mission";
        }

        System.out.println("Ninja 3: " + ninja3);
        System.out.println("Ninja age: " + ageNinja3);
        System.out.println("Mission 1: " + missionInfo3);
        System.out.println("Mission Level: " + mission3);
        System.out.println("Mission Status: " + statusNinja3);
    }
}
