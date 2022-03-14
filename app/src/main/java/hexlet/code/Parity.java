package hexlet.code;

import java.util.Scanner;

public class Parity {
    public static void parityGame() {
        String userName = Cli.getName();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int rightAnswer = 0;
        for (int i = 0; i < 3; i++) {
            int randomNumber = (int) ( Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            switch (answer) {
                case "yes":
                if (randomNumber % 2 == 0) {
                    System.out.println("Correct!");
                    rightAnswer++;
                } else if (randomNumber % 2 == 1) {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName + "!");
                    i = 2;
                }
                break;
                case "no":
                    if (randomNumber % 2 == 1) {
                        System.out.println("Correct!");
                        rightAnswer++;
                    } else if (randomNumber % 2 == 0) {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                        System.out.println("Let's try again, " + userName + "!");
                        i = 2;
                    }
                    break;
                default:
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'Yes/no'.");
                System.out.println("Let's try again, " + userName + "!");
                i = 2;
                break;
            }
        }
        if (rightAnswer == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}