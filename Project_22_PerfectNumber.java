//A perfect number is a positive integer
// which is equal to the sum of its proper positive  divisor.

public class Project_22_PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
        isPerfectNumber(0);
        isPerfectNumber(44);

    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0, i;
        if (number > 0) {
            for (i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println(number + " is a perfect number.");
                return true;
            } else {
                System.out.println(number + " is NOT a perfect number.");
                return false;
            }
        }
        return false;
    }
}
