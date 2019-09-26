public class Project_23_NumberToWords {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

    }

    public static void numberToWords(int number) {
        int reverseNumber = reverse(number);
        int countDigitMethod = getDigitCount(number);
        int lastDigit;
        int count = 0;

        if (reverseNumber < 0) {
            System.out.println("Invalid Value");
        }

        while (countDigitMethod > count) {
            lastDigit = reverseNumber % 10; //extract last digit
            reverseNumber /= 10;
            count++;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int remainder;

        while (number > 0 || number < 0) {
            remainder = number % 10;
            number /= 10;
            reverse *= 10;
            reverse += remainder;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;

        if (number == 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        }

        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
