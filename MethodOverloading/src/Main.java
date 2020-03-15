public class Main {

    // Overloading implies same method name but different number of params
    public static void main(String[] args) {
        int newScore = calculateScore("Anthony", 500);
        System.out.println("New score is " + newScore);
        calculateScore(13);
        calculateScore();

        calcFeetAndInchesToCentimeters(-10, 1);
        calcFeetAndInchesToCentimeters(6, -10);
        calcFeetAndInchesToCentimeters(0, 6);
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(-100);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score*1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score*1000;
    }

    public static int calculateScore() {
        System.out.println("No name, no score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (!((feet >= 0) && ((inches>=0) && (inches<=12)))) {
            System.out.println("Invalid feet or inches parameters :( ");
            return -1;
        }
        System.out.println( feet + " feet, inches : " + inches);
        double result = (feet * 30.48) + (inches * 2.54);
        return result;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (!(inches >= 0)) {
            System.out.println("Invalid input");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println( feet + " feet, inches : " + remainingInches);
        return feet;
    }
}
