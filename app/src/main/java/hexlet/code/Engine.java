package hexlet.code;

public class Engine {
    public static void check(boolean checkGamePass, int i, String userName) {
        if (!checkGamePass) {
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        System.out.println("Correct!");
        if (i == 2) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }
    public static void engine(int choiceGame) {
        final int maxRound = 3;
        final int greet = 1;
        final int parityGame = 2;
        final int calcGame = 3;
        final int gcdGame = 4; // greatest common divisor
        final int progressionGame = 5;
        final int primeGame = 6;
        final int randUpperLimit = 100;
        String userName;

        switch (choiceGame) {
            case greet:
                System.out.println("Welcome to the Brain Games!");
                userName = Cli.getName();
                break;
            case parityGame:
                System.out.println("Welcome to the Brain Games!");
                userName = Cli.getName();
                for (int i = 0; i < maxRound; i++) {
                    boolean checkGamePass = Parity.parityGame(randUpperLimit);
                    check(checkGamePass, i, userName);
                }
                break;
            case calcGame:
                System.out.println("Welcome to the Brain Games!");
                userName = Cli.getName();
                for (int i = 0; i < maxRound; i++) {
                    boolean checkGamePass = Calc.calcGame(i, randUpperLimit);
                    check(checkGamePass, i, userName);
                }
                break;
            case gcdGame:
                System.out.println("Welcome to the Brain Games!");
                userName = Cli.getName();
                for (int i = 0; i < maxRound; i++) {
                    boolean checkGamePass = Gcd.gcdGame(randUpperLimit);
                    check(checkGamePass, i, userName);
                }
                break;
            case progressionGame:
                System.out.println("Welcome to the Brain Games!");
                userName = Cli.getName();
                for (int i = 0; i < maxRound; i++) {
                    boolean checkGamePass = ProgressionGame.progressGame(randUpperLimit);
                    check(checkGamePass, i, userName);
                }
                break;
            case primeGame:
                System.out.println("Welcome to the Brain Games!");
                userName = Cli.getName();
                for (int i = 0; i < maxRound; i++) {
                    boolean checkGamePass = PrimeGame.primeGame(randUpperLimit);
                    check(checkGamePass, i, userName);
                }
                break;
            default:
                break;
        }
    }
}

