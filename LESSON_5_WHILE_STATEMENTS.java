public class LESSON_5_WHILE_STATEMENTS {
    public static void main(String[] args) {
        int count = 1; //init

        while (count != 6) { //condition
            System.out.println("Count value is " + count);
            count++; //increment
        }

        //FOR LOOP BELOW IS NOT IDENTICAL TO THE ABOVE WHILE LOOP!
       /* for (int i = 1; i < 7; i++) {
            System.out.println("Count value is " + count);
        }*/

        //Same result
        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        //DO-WHILE LOOP
        do {
            System.out.println("Count value is " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);

        //Calling the method
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found: " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
