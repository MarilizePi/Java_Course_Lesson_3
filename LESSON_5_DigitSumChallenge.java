public class LESSON_5_DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in 5 is " + sumDigits(5));
        System.out.println("The sum of the digits in 2244 is " + sumDigits(2244));
        System.out.println("The sum of the digits in -1222 is " + sumDigits(-1222));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        //125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            //extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least significant digit
            number /= 10; //same as number = number / 10;

        }
        return sum;
    }

}
