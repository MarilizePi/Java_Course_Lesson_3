public class Project_3_BarkingDog {
    public static void main(String[] args) {
        boolean print = shouldWakeUp(true, -1);
        System.out.println(print);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = (hourOfDay < 8 || hourOfDay > 22);

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking) {
            return wakeUp;
        }
        return false;
    }
}
