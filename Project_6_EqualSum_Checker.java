public class EqualSum_Checker {
    
    public static void main(String[] args) {
        hasEqualSum(3,2,6);
        hasEqualSum(2,-2,0);
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber,
                                      int thirdNumber) {
        if ((firstNumber + secondNumber) == thirdNumber) {
            System.out.println(firstNumber + " + " + secondNumber +
                    " = " + thirdNumber);
            return true;
        } else {
            System.out.println(firstNumber + " + " +
                    secondNumber + " does not equal " + thirdNumber);
            return false;
        }
    }
}
