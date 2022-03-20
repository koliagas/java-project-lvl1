package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final String DESCRIPTION_GAME = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void runGame() {
        final int gcdRandomNumberStart = 1;
        String[][] conditions = new String[Engine.GAME_ITER][2];
        int iter = 0;

        while (iter < Engine.GAME_ITER) {
            int randomNumber1 = Utils.getRandom(gcdRandomNumberStart, MAX_RANDOM_NUMBER);
            int randomNumber2 = Utils.getRandom(gcdRandomNumberStart, MAX_RANDOM_NUMBER);
            conditions[iter][Engine.CONDITION] = randomNumber1 + " " + randomNumber2;
            int rightAnswer = 1;

            for (int i = 2; i <= Math.min(randomNumber1, randomNumber2); i++) {
                if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                    rightAnswer = i;
                }
            }

            conditions[iter][Engine.RIGHT_ANSWER] = "" + rightAnswer;
            iter++;
        }

        Engine.runEngine(conditions, DESCRIPTION_GAME);
    }
}
