public class Project_14_SumOdd {
    public static void main(String[] args) {
        sumOdd(1, 100);
        sumOdd(-1, 100);
        sumOdd(100, 100);
        sumOdd(13, 13);
        sumOdd(100, -100);
        sumOdd(100, 1000);

    }

    public static boolean isOdd(int number) {

        if (number > 0) {
            return (number % 2 != 0); //if the number divided by 2 doesn't have
            // a remainder of zero, it means that it is odd. Otherwise it is even.
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) { //start and end represent the range

        int sum = 0;
        if ((end >= start) && (start > 0) && (end > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) { //called the method isOdd() to check if each number is odd.
                    sum += i;
                }
            }
            System.out.println(sum);
            return sum;
        } else {
            System.out.println("Invalid input.");
            return -1;
        }
    }
}
