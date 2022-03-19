package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String DESCRIPTION_GAME = "What number is missing in the progression?";
    private static final int CONDITION = 0;
    private static final int RIGHT_ANSWER = 1;

    public static void progressGame() {
        final int randNumberStart = 0;
        final int randNumberEnd = 100;
        final int progressSizeStart = 5;
        final int progressSizeEnd = 6;
        final int progressionDifferenceStart = 2;
        final int progressionDifferenceEnd = 10;
        final int positionMissedNumberStart = 2;
        final int gameIter = 3;
        String[][] conditions = new String[2][gameIter];
        int iter = 0;

        do {
            int randomNumber = Utils.getRandom(randNumberStart, randNumberEnd);
            int progressionSize = Utils.getRandom(progressSizeStart, progressSizeEnd);
            int missedNumber = Utils.getRandom(positionMissedNumberStart, progressionSize);
            int progression = Utils.getRandom(progressionDifferenceStart, progressionDifferenceEnd);
            conditions[CONDITION][iter] = "";
            for (int i = 0; i <= progressionSize; i++) {
                if (i == missedNumber) {
                    conditions[CONDITION][iter] +=  ".. ";
                    conditions[RIGHT_ANSWER][iter] = "" + randomNumber;
                    randomNumber += progression;
                    i++;
                } else if (i != missedNumber) {
                    conditions[CONDITION][iter] += randomNumber + " ";
                    randomNumber += progression;
                }
            }
            iter++;
        } while (iter < gameIter);

        Engine.runGame(conditions, DESCRIPTION_GAME);
    }
}
