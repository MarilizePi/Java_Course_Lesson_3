// Method Overloading: is the option where you use the same method
//name but with different parameters.

public class Lesson_4_Part_2 {
    public static void main(String[] args) {
        int newScore = calculateScore("Mari", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(2, 0);
        calcFeetAndInchesToCentimeters(3, -1);
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(-4);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name. No player score.");
        return 0;
    }

    //CHALLENGE: CONVERT FEET & INCHES TO CENTIMETERS
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid input.");
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " ft, " + inches + " in = " +
                    centimeters + " cm.");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet +
                " feet and " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
