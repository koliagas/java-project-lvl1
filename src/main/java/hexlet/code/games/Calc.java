package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String DESCRIPTION_GAME = "What is the result of the expression?";

    public static int operations(char aritmeticOperation, int randomNumber1, int randomNumber2) {
        int rightAnswer = 0;
        switch (aritmeticOperation) {
            case '*':
                rightAnswer = randomNumber1 * randomNumber2;
                break;
            case '+':
                rightAnswer = randomNumber1 + randomNumber2;
                break;
            case '-':
                rightAnswer = randomNumber1 - randomNumber2;
                break;
            default:
                break;
        }
        return rightAnswer;
    }
    public static void runGame() {
        final int gcdNumberEnd = 100;
        final char[] arithmeticOperations = {'*', '+', '-'};
        String[][] conditions = new String[Engine.GAME_ITER][2];
        int iter = 0;

        while (iter < Engine.GAME_ITER) {
            int randomNumber1 = Utils.getRandom(1, gcdNumberEnd);
            int randomNumber2 = Utils.getRandom(1, gcdNumberEnd);
            int randomOperations = Utils.getRandom(0, arithmeticOperations.length);

            conditions[iter][Engine.CONDITION] = randomNumber1 + " " + arithmeticOperations[iter] + " " + randomNumber2;
            conditions[iter][Engine.RIGHT_ANSWER] = "" + operations(arithmeticOperations[randomOperations],
                    randomNumber1, randomNumber2);
            iter++;
        }

        Engine.runEngine(conditions, DESCRIPTION_GAME);
    }
}
