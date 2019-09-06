public class LeapYearCalculator {
    
    public static void main(String[] args) {
        isLeapYear(-1200);
    }

    public static boolean isLeapYear(int year) {
        boolean range = (year < 1 || year > 9999);
        boolean divisibleBy4 = (year % 4 == 0);
        boolean divisibleBy100 = (year % 100 == 0);
        boolean divisibleBy400 = (year % 400 == 0);

        if (range) {
            System.out.println("Out of range: 1-9999 only");
            return false;
        }

        if ((divisibleBy4) && (!divisibleBy100 ||
                (divisibleBy100 && divisibleBy400))) {
            System.out.println("This is a leap year.");
            return true;
        } else {
            System.out.println("This is not a leap year.");
            return false;
        }
    }
}
