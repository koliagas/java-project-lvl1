package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String DESCRIPTION_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        final int primeNumberStart = 2;
        final int primeNumberEnd = 100;
        String[][] conditions = new String[Engine.GAME_ITER][2];

        int iter = 0;

        while (iter < Engine.GAME_ITER) {
            String rightAnswer = "yes";
            int randomNumber = Utils.getRandom(primeNumberStart, primeNumberEnd);
            conditions[iter][Engine.CONDITION] = "" + randomNumber;
            int squareRootOfNumber = (int) Math.sqrt(randomNumber);

            for (int i = 2; i <= squareRootOfNumber; i++) {
                if (randomNumber % i == 0) {
                    rightAnswer = "no";
                    break;
                }
            }

            conditions[iter][Engine.RIGHT_ANSWER] = rightAnswer;
            iter++;
        }

        Engine.runEngine(conditions, DESCRIPTION_GAME);
    }
}
