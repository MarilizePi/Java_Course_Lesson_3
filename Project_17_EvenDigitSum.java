//There is a syntax error which I need to fix

public class Project_17_EvenDigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(3456);
        getEvenDigitSum(123);
        getEvenDigitSum(-12);
        getEvenDigitSum(222);
        getEvenDigitSum(135);


    }

    public static int getEvenDigitSum(int number) {
        int sumEven = 0, lastDigit;

        if (number < 0) {
            System.out.println("Invalid number");
            return -1;
        }
        while (number > 0) {
            lastDigit = (number % 10);

            if ((lastDigit % 2) == 0) {
                sumEven += lastDigit;
            }
            number /= 10;
        }
        System.out.println("The sum of the even numbers of " +
                number + " is: " + sumEven);
        return sumEven;
    }
}