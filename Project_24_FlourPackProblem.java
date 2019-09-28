public class Project_24_FlourPackProblem {
    public static void main(String[] args) {
        canPack(1, 0, 4);
        canPack(1, 0, 5);
        canPack(0, 5, 4);
        canPack(2, 2, 11);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int bigCountWeightKg = 5;
        int smallCountWeightKg = 1;

        int result = ((bigCountWeightKg * bigCount) % goal);  // (5 * 1) % 5

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if ((bigCountWeightKg * bigCount) + (smallCountWeightKg * smallCount) < goal) {
            return false;
        } else if ((result != 0) && ((smallCountWeightKg * smallCount) + result) < 5) {
            return false;
        }
        return true;
    }
}
