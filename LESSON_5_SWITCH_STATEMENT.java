public class LESSON_5_SWITCH_STATEMENT {
    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1.");
        } else if (value == 2) {
            System.out.println("Value was 2.");
        } else {
            System.out.println("Was not 1 or 2.");
        }

        //Something equivalent
        //The switch statement is good if you want to test the same
        //variable, and different values for that variable.

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break; //if there is no break, you create
            //unpredictable results. It continues onto the next statement.

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);

            default:
                System.out.println("Was not the number");
                break; //you don't need the last break, but it is always good to use.
        }

        //CHALLENGE

        char charValue = 'A';

        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("C, D, or E was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }

        String month = "january";

        switch (month.toLowerCase()) { //be careful with lower and upper case
            case "January":
                System.out.println("Jan");
                break;
            case "March":
                System.out.println("Mar");
                break;
            default:
                System.out.println("Other month");
                break;
        }
    }
}
