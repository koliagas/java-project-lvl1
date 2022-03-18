package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String DESCRIPTION_GAME = "What is the result of the expression?";
    private static final int CONDITION = 0;
    private static final int RIGHT_ANSWER = 1;

    public static void calcGame() {
        final int gcdNumberStart = 1;
        final int gcdNumberEnd = 100;
        final char[] arithmetic = {'*', '+', '-'};
        final int gameIter = 3;
        String[][] conditions = new String[2][gameIter];
        int iter = 0;

        do {
            int randomNumber = Utils.getRandom(gcdNumberStart, gcdNumberEnd);
            int randomNumber2 = Utils.getRandom(gcdNumberStart, gcdNumberEnd);
            int rightAnswer = 0;
            conditions[CONDITION][iter] = randomNumber + " " + arithmetic[iter] + " " + randomNumber2;

            switch (iter) {
                case 0:
                    rightAnswer = randomNumber * randomNumber2;
                    break;
                case 1:
                    rightAnswer = randomNumber + randomNumber2;
                    break;
                case 2:
                    rightAnswer = randomNumber - randomNumber2;
                    break;
                default:
                    break;
            }
            conditions[RIGHT_ANSWER][iter] = "" + rightAnswer;
            iter++;
        } while (iter < gameIter);

        Engine.runGame(conditions, DESCRIPTION_GAME);
    }
}
