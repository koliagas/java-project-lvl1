package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int CONDITION = 0;
    private static final int RIGHT_ANSWER = 1;
    public static void runGame(String[][] conditions, String description) {
        final int maxRound = 3;
        String answer;
        String userName;

        userName = Cli.getName();

        System.out.println(description);
        for (int i = 0; i < maxRound; i++) {
            System.out.println("Question: " + conditions[CONDITION][i]);
            System.out.print("Your answer: ");

            Scanner userChoice = new Scanner(System.in);
            answer = userChoice.nextLine();

            if (answer.equals(conditions[RIGHT_ANSWER][i])) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else if (!answer.equals(conditions[RIGHT_ANSWER][i])) {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + conditions[RIGHT_ANSWER][i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

    }
}

