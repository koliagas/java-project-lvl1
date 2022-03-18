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
                Cli.getName();
                break;
            case parityGame:
                Parity.parityGame();
                break;
            case calcGame:
                Calc.calcGame();
                break;
            case gcdGame:
                Gcd.gcdGame();
                break;
            case progressionGame:
                Progression.progressGame();
                break;
            case primeGame:
                Prime.primeGame();
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}
