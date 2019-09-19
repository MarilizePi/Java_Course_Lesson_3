public class Project_16_FirstAndLastDigitSum {
    public static void main(String[] args) {
        sumFirstAndLastDigit(10);
        sumFirstAndLastDigit(443);
        sumFirstAndLastDigit(5535353);
        sumFirstAndLastDigit(-122);

    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit, lastDigit, sum;

        lastDigit = number % 10; //This will give me the last digit
        firstDigit = number;

        while (firstDigit >= 10) { //Remove the last digit of "number" until only
            //one digit is left.
            firstDigit /= 10;
        }

        if (number >= 0) {
            sum = firstDigit + lastDigit;
            System.out.println("The sum of the first and last digits of " +
                    number + " is: " + sum);
            return sum;
        } else {
            System.out.println(number + " is an invalid input.");
            return -1;
        }
    }
}
