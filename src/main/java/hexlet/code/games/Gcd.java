package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final String DESCRIPTION_GAME = "Find the greatest common divisor of given numbers.";
    private static final int CONDITION = 0;
    private static final int RIGHT_ANSWER = 1;

    public static void gcdGame() {
        final int gameIter = 3;
        final int gcdNumberStart = 1;
        final int gcdNumberEnd = 100;
        String[][] conditions = new String[2][gameIter];
        int iter = 0;

        do {
            int randomNumber = Utils.getRandom(gcdNumberStart, gcdNumberEnd);
            int randomNumber2 = Utils.getRandom(gcdNumberStart, gcdNumberEnd);
            conditions[CONDITION][iter] = randomNumber + " " + randomNumber2;
            int rightAnswer = 1;
            int smallNumber = Math.min(randomNumber, randomNumber2);

            for (int i = 2; i <= smallNumber; i++) {
                if ((randomNumber % i == 0) && (randomNumber2 % i == 0)) {
                    rightAnswer = i;
                }
            }

            conditions[RIGHT_ANSWER][iter] = "" + rightAnswer;
            iter++;
        } while (iter < gameIter);

        Engine.runGame(conditions, DESCRIPTION_GAME);
    }
}
