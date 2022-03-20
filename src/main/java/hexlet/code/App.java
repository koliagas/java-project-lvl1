package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Parity;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int greet = 1;
        final int parityGame = 2;
        final int calcGame = 3;
        final int gcdGame = 4; // greatest common divisor
        final int progressionGame = 5;
        final int primeGame = 6;
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n");

        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int choiceGame = sc.nextInt();


        switch (choiceGame) {
            case greet:
                System.out.print("Welcome to the Brain Games! \n"
                       + "May I have your name? ");
                String userName = Cli.getName();
                System.out.println("Hello, " + userName + "!");
                break;
            case parityGame:
                Parity.runGame();
                break;
            case calcGame:
                Calc.runGame();
                break;
            case gcdGame:
                Gcd.runGame();
                break;
            case progressionGame:
                Progression.runGame();
                break;
            case primeGame:
                Prime.runGame();
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}
