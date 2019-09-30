public class Project_26_DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {

        int column;
        int row;

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (row = 1; row <= number; row++) {
                for (column = 1; column <= number; column++) {
                    char symbol = (row == 1 || column == 1 || row == number || column == number || row == column
                            || column == number - row + 1) ? '*' : ' ';

                    System.out.print(symbol);
                }

                System.out.println();
            }
        }
    }
}