package hexlet.code;

import java.util.Scanner;

public class ProgressionGame {
    public static boolean progressGame(int randUpperLimit) {
        final int upperProgressSize = 5;
        final int lowerProgressSize = 5;
        final int lowerProgression = 2;
        int randomNumber = (int) (Math.random() * randUpperLimit);
        int progressSize = lowerProgressSize + (int) (Math.random() * upperProgressSize);
        int missedNumber = (int) (Math.random() * upperProgressSize);
        int progression = lowerProgression + (int) (Math.random() * randUpperLimit);
        int rightAnswer = 0;
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < progressSize; i++) {
            if (i == missedNumber) {
                System.out.print(" .. ");
                rightAnswer = randomNumber;
                randomNumber += progression;
                i++;
            } else if (i != missedNumber) {
                System.out.print(randomNumber + " ");
                randomNumber += progression;
            }
        }
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if (answer == rightAnswer) {
            return true;
        }
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
        return false;

    }
}
