public class Project_21_AllFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

    }

    public static void printFactors(int number) {
        int divisor = 0;

        if (number < 1) {
            System.out.println("Invalid Value");
        }

        //LOGIC BEHIND THE CODE:
        // First: I equal my index 1, because we cannot divide by zero.
        // Second: Let say that my number is 6. My index equal 1, which is less than or equal to 6.
        // So, I move on to the next line of code.
        // Third, I check if 6 and 1 will have a remainder of zero ( in other words, if the are divisible by each other).
        // If yes, then the integer "divisor" equals to my index, which is 1. I print out "divisor".
        // Next, I go back to the loop. Now my index is incremented to 2. I check if 2 is less than or equal to 6.
        // If yes, I move on the next line of code. I then check if 6 and 2 will have a remainder. If no, I print 2.
        // Same thing with number 3.
        // When I get to number 4, the if statement will be false, because 6 and 4 have a remainder. So, it goes back
        //to the for look. Number 5 will be false and number 6 will be true.

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisor = i;
                System.out.println(divisor);
            }
        }
    }
}