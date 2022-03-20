package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String DESCRIPTION_GAME = "What is the result of the expression?";
    private static final int MAX_RANDOM_NUMBER = 100;

    public static int getRightAnswer(char aritmeticOperation, int randomNumber1, int randomNumber2) {
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
        final char[] arithmeticOperations = {'*', '+', '-'};
        String[][] conditions = new String[Engine.GAME_ITER][2];
        int iter = 0;

        while (iter < Engine.GAME_ITER) {
            int randomNumber1 = Utils.getRandom(1, MAX_RANDOM_NUMBER);
            int randomNumber2 = Utils.getRandom(1, MAX_RANDOM_NUMBER);
            int randomOperations = Utils.getRandom(0, arithmeticOperations.length);

            conditions[iter][Engine.CONDITION] = randomNumber1 + " " + arithmeticOperations[iter] + " " + randomNumber2;
            conditions[iter][Engine.RIGHT_ANSWER] = "" + getRightAnswer(arithmeticOperations[randomOperations],
                    randomNumber1, randomNumber2);
            iter++;
        }

        Engine.runEngine(conditions, DESCRIPTION_GAME);
    }
}
