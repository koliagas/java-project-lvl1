package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String DESCRIPTION_GAME = "What number is missing in the progression?";

    public static void runGame() {
        final int randNumberEnd = 100;
        final int progressSizeStart = 5;
        final int progressSizeEnd = 6;
        final int progressionDifferenceStart = 2;
        final int progressionDifferenceEnd = 10;
        String[][] conditions = new String[Engine.GAME_ITER][2];
        int iter = 0;

        while (iter < Engine.GAME_ITER) {
            int randomNumber = Utils.getRandom(0, randNumberEnd);
            int progressionSize = Utils.getRandom(progressSizeStart, progressSizeEnd);
            int missedNumber = Utils.getRandom(0, progressionSize);
            int progression = Utils.getRandom(progressionDifferenceStart, progressionDifferenceEnd);
            conditions[iter][Engine.CONDITION] = "";

            for (int i = 0; i <= progressionSize; i++) {
                if (i == missedNumber) {
                    conditions[iter][Engine.CONDITION] +=  ".. ";
                    conditions[iter][Engine.RIGHT_ANSWER] = "" + randomNumber;
                    randomNumber += progression;
                    i++;
                }
                conditions[iter][Engine.CONDITION] += randomNumber + " ";
                randomNumber += progression;
            }
            iter++;
        }

        Engine.runEngine(conditions, DESCRIPTION_GAME);
    }
}
