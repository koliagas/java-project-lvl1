package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Parity {
    private static final String DESCRIPTION_GAME = "Answer 'yes' if number even otherwise answer 'no'.";
    public static String isEven(int modulo) {
        if (modulo == 0) {
            return "yes";
        }
        return  "no";
    }
    public static void runGame() {
        final int randStart = 1;
        final int randEnd = 100;
        String[][] conditions = new String[Engine.GAME_ITER][2];
        int iter = 0;

        while (iter < Engine.GAME_ITER) {
            int randomNumber = Utils.getRandom(randStart, randEnd);
            conditions[iter][Engine.CONDITION] = "" + randomNumber;
            int modulo = randomNumber % 2;
            conditions[iter][Engine.RIGHT_ANSWER] = isEven(modulo);
            iter++;
        }

        Engine.runEngine(conditions, DESCRIPTION_GAME);
    }
}
