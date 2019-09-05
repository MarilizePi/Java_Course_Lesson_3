public class Project_7_TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(13,5,3);
        hasTeen(55,44,19);
        hasTeen(0,0,1);
        isTeen(5);
        isTeen(16);
    }

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        int ageRange1 = 13;
        int ageRange2 = 19;

        if ((ageOne >= ageRange1 && ageOne <= ageRange2) ||
                (ageTwo >= ageRange1 && ageTwo <= ageRange2) ||
                (ageThree >= ageRange1 && ageThree <= ageRange2)) {
            System.out.println("One of the people is a teen, because " +
                    " one of the numbers is in the range 13-19.");
            return true;
        } else {
            System.out.println("There is no teen");
            return false;
        }
    }

    public static boolean isTeen(int ageRange) {
        int ageRange1 = 13;
        int ageRange2 = 19;

        if (ageRange >= ageRange1 && ageRange <= ageRange2) {
            System.out.println("This person is a teen.");
            return true;
        } else {
            System.out.println("This person is not a teen.");
            return false;
        }
    }
}
