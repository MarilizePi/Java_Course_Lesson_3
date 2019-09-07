public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600L);
        printYearsAndDays(1051200L);
        printYearsAndDays(561600L);
        printYearsAndDays(-1);

    }

    public static void printYearsAndDays(long minutes) {

        long hours = minutes / 60;
        long day = hours / 24;
        long year = day / 365;
        long remainingDays = day % 365;

        if (minutes < 0) {
            System.out.println("Invalid Value.");
        } else {
            System.out.println(minutes + " min = " + year + " y and " +
                    remainingDays + " d.");
        }
    }
}
