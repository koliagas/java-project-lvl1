package hexlet.code;

import java.util.Scanner;

public class Parity {
    public static boolean parityGame(int randomNumber) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        System.out.println("Question: " + randomNumber);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        String strRightAnswer = "";
        int rightAnswer = randomNumber % 2;
        if (rightAnswer == 0) {
            strRightAnswer = "yes";
        } else if (rightAnswer == 1) {
            strRightAnswer = "no";
        }
        if (answer.equals(strRightAnswer)) {
            return true;
        }
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + strRightAnswer + "'.");
        return false;
    }
}
