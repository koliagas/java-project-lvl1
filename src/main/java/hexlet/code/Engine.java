package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int CONDITION = 0;
    public static final int RIGHT_ANSWER = 1;
    public static final int GAME_ITER = 3;
    public static void runEngine(String[][] conditions, String description) {
        String answer;
        String userName;

        System.out.print("Welcome to the Brain Games! \n"
                + "May I have your name? ");
        userName = Cli.getName();
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);
        for (int i = 0; i < GAME_ITER; i++) {
            System.out.print("Question: " + conditions[i][CONDITION] + "\n"
                    + "Your answer: ");

            Scanner userChoice = new Scanner(System.in);
            answer = userChoice.nextLine();

            if (!answer.equals(conditions[i][RIGHT_ANSWER])) {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + conditions[i][RIGHT_ANSWER] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            System.out.println("Correct!");
            if (i == GAME_ITER - 1) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}

