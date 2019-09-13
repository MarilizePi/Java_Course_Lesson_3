import javax.sound.midi.Soundbank;

public class Project_13_NumberOfDaysInMonth {
    public static void main(String[] args) {
        int calculateGetDaysInMonth = getDaysInMonth(2, 2020);

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

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12)) {
            return -1;
        }
        if ((year < 1) || (year > 9999)) {
            return -1;
        }

        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            default:
                return 31;
        }

    }
}
