public class Project_18_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(24, 12));
        System.out.println(hasSharedDigit(2, 12));
        System.out.println(hasSharedDigit(56, 16));
        System.out.println(hasSharedDigit(24, 100));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if((firstNumber < 10 || firstNumber > 99)
                || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }

        return (((firstNumber % 10) == (secondNumber % 10)) ||
                ((firstNumber % 10) == (secondNumber / 10)) ||
                ((firstNumber / 10) == (secondNumber % 10)) ||
                ((firstNumber / 10) == (secondNumber / 10)));
    }
}
