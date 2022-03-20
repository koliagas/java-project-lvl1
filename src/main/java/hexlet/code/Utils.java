package hexlet.code;

public class Utils {
    public static int getRandom(int minRandom, int maxRandom) {
        return minRandom + (int) (Math.random() * maxRandom);
    }
}
