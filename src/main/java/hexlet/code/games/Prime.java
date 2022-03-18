package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String DESCRIPTION_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int CONDITION = 0;
    private static final int RIGHT_ANSWER = 1;

    public static void primeGame() {
        final int primeNumberStart = 2;
        final int primeNumberEnd = 100;
        final int gameIter = 3;
        String[][] conditions = new String[2][gameIter];
        String rightAnswer = "yes";
        int iter = 0;

        do {
            int randomNumber = Utils.getRandom(primeNumberStart, primeNumberEnd);
            conditions[CONDITION][iter] = "" + randomNumber;
            int squareRootOfNumber = (int) Math.sqrt(randomNumber);
            for (int i = 2; i <= squareRootOfNumber; i++) {
                if (randomNumber % i == 0) {
                    rightAnswer = "no";
                    break;
                }
            }
            conditions[RIGHT_ANSWER][iter] = rightAnswer;
            iter++;
        } while (iter < gameIter);

        Engine.runGame(conditions, DESCRIPTION_GAME);
    }
}
