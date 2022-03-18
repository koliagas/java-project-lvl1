package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Parity {
    private static final String DESCRIPTION_GAME = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int CONDITION = 0;
    private static final int RIGHT_ANSWER = 1;

    public static void parityGame() {
        final int gameIter = 3;
        final int randStart = 1;
        final int randEnd = 100;
        String[][] conditions = new String[2][gameIter];
        int iter = 0;

        do {
            int randomNumber = Utils.getRandom(randStart, randEnd);
            conditions[CONDITION][iter] = "" + randomNumber;
            int isEven = randomNumber % 2;
            if (isEven == 0) {
                conditions[RIGHT_ANSWER][iter] = "yes";
            } else if (isEven == 1) {
                conditions[RIGHT_ANSWER][iter] = "no";
            }
            iter++;
        } while (iter < gameIter);

        Engine.runGame(conditions, DESCRIPTION_GAME);
    }
}
