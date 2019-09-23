public class Project_20_GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(" " + getGreatestCommonDivisor(25, 15));
        System.out.println(" " + getGreatestCommonDivisor(12, 30));
        System.out.println(" " + getGreatestCommonDivisor(9, 18));
        System.out.println(" " + getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        int commonFactor;

        if ((firstNumber < 10) || (secondNumber < 10)) {
            return -1;
        }

        if (firstNumber > secondNumber) {
            commonFactor = secondNumber;
        } else {
            commonFactor = firstNumber;
        }

        while ((firstNumber % commonFactor != 0) ||
                (secondNumber % commonFactor != 0)) {
            commonFactor--;
        }
        return commonFactor;
    }
}
