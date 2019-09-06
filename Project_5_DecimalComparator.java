public class DecimalComparator {
    
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.1756, -3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber,
                                                       double secondNumber) {
        int firstNumberInt = (int) (firstNumber * 1000);
        int secondNumberInt = (int) (secondNumber * 1000);

        if (firstNumberInt == secondNumberInt) {
            System.out.println("The numbers are equal.");
            return true;
        } else {
            System.out.println("The numbers are not equal.");
            return false;
        }
    }
}
