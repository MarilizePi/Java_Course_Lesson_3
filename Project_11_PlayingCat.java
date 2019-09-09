public class Project_11_PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
        isCatPlaying(true, 45);

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature > 24 && ((summer && temperature < 46) || temperature < 36)) {
            System.out.println("The cat is playing.");
            return true;
        }
        System.out.println("The cat is not playing.");
        return false;
    }
}
