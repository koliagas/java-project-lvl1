package hexlet.code.games;

import java.util.Scanner;

public class PrimeGame {
    public static boolean primeGame(int randUpperLimit) {
        int randomNumber = (int) (Math.random() * randUpperLimit);
        int delimeters = 0;
        String rightAnswer = "";
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        System.out.println("Question: " + randomNumber);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        int squareRootOfNumber = (int) Math.sqrt(randomNumber);

        for (int i = 2; i <= squareRootOfNumber; i++) {
            if (randomNumber % i == 0) {
                delimeters++;
            }
        }

        if (delimeters == 0) {
            rightAnswer = "yes";
        } else if (delimeters > 0) {
            rightAnswer = "no";
        }
        if (answer.equals(rightAnswer)) {
            return true;
        }

        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
        return false;

    }
}
