package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static boolean calcGame(int i, int randUpperLimit) {
        int randomNumber = (int) (Math.random() * randUpperLimit);
        int randomNumber2 = (int) (Math.random() * randUpperLimit);
        System.out.println("What is the result of the expression?");
        char[] arithmetic = {'*', '+', '-'};
        int rightAnswer = 0;

        System.out.println("Question: " + randomNumber + " " + arithmetic[i] + " " + randomNumber2);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        switch (i) {
            case 0:
                rightAnswer = randomNumber * randomNumber2;
                break;
            case 1:
                rightAnswer = randomNumber + randomNumber2;
                break;
            case 2:
                rightAnswer = randomNumber - randomNumber2;
                break;
            default:
                break;
        }
        if (answer == rightAnswer) {
            return true;
        }
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
        return false;
    }
}
