package hexlet.code;

public class Utils {
    public static int getRandom(int minRandom, int maxRandom) {
        int mathRandom = minRandom + (int) (Math.random() * maxRandom);
        return mathRandom;
    }
}
