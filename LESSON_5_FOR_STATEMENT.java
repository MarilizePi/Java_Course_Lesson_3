//For loop: execute a code a certain amount of times.

public class LESSON_5_FOR_STATEMENT {
    public static void main(String[] args) {
        //This can be tedious and inefficient. That is why we can use for loop
        //statement to automate code.
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        // for(init; termination/condition; increment){
        // }

       /* for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }*/

        //Alternative method
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("***************");

        //Alternative method to decrement from 8 to 2, instead of increment
        //from 2 to 8.
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, i)));
        }

        //Calling the isPrime method

        System.out.println("***************");
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if (count == 10) {
                    System.out.println("Exiting for loop.");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    //Determine if it is a prime number
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) { //or, we could use
            // "(long) Math.sqrt(n)" for termination/condition.
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
