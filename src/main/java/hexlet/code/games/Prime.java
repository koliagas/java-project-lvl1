package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String DESCRIPTION_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 100;
    public static void runGame() {
        String[][] conditions = new String[Engine.GAME_ITER][2];

        int iter = 0;

        while (iter < Engine.GAME_ITER) {
            String rightAnswer = "yes";
            int randomNumber = Utils.getRandom(0, MAX_RANDOM_NUMBER);
            conditions[iter][Engine.CONDITION] = "" + randomNumber;
            int squareRootOfNumber = (int) Math.sqrt(randomNumber);

            for (int i = 2; i <= squareRootOfNumber; i++) {
                if (randomNumber % i == 0) {
                    rightAnswer = "no";
                    break;
                }
            }
            if (randomNumber == 0 || randomNumber == 1) {
                rightAnswer = "no";
            }

            conditions[iter][Engine.RIGHT_ANSWER] = rightAnswer;
            iter++;
        }

        Engine.runEngine(conditions, DESCRIPTION_GAME);
    }
}
