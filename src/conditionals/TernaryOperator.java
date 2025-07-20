package conditionals;

public class TernaryOperator {
    public static void main(String[] args) {
        short numberOfMissions = 11;
        String level = (numberOfMissions >=10) ? "This Ninja has more than 10 missions"
                : "This Ninja has less than 10 missions";
        System.out.println(level);
    }
}
