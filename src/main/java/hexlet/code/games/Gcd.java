package hexlet.code.games;

import java.util.Scanner;

public class Gcd {
    public static boolean gcdGame(int randUpperLimit) {
        int randomNumber = (int) (Math.random() * randUpperLimit);
        int randomNumber2 = (int) (Math.random() * randUpperLimit);
        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question: " + randomNumber + " " + randomNumber2);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        int rightAnswer = 0;
        int smallNumber = randomNumber;
        if (randomNumber > randomNumber2) {
            smallNumber = randomNumber2;
        }
        for (int i = 1; i <= smallNumber; i++) {
            if ((randomNumber % i == 0) && (randomNumber2 % i == 0)) {
                rightAnswer = i;
            }
        }
        if (answer == rightAnswer) {
            return true;
        }
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
        return false;
    }
}
