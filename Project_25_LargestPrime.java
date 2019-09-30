public class Project_25_LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int factor = 2;
        boolean isPrime = false;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int k = 2; k < i; k++) {
                    if (i % k == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
                if ((isPrime) && (i > factor)) {
                    factor = i;
                }
            }
        }
        return factor;
    }
}
