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
        final int parityGame = 2;
        final int calcGame = 3;
        final int gcdGame = 4; // greatest common divisor
        System.out.println("Welcome to the Brain Games!");
        String userName = Cli.getName();
        final int randUpperLimit = 100;
        switch (choiceGame) {
            case parityGame:
                for (int i = 0; i < maxRound; i++) {
                    boolean checkGamePass = Parity.parityGame(randUpperLimit);
                    check(checkGamePass, i, userName);
                }
                break;
            case calcGame:
                for (int i = 0; i < maxRound; i++) {
                    boolean checkGamePass = Calc.calcGame(i, randUpperLimit);
                    check(checkGamePass, i, userName);
                }
                break;
            case gcdGame:
                for (int i = 0; i < maxRound; i++) {
                    boolean checkGamePass = Gcd.gcdGame(randUpperLimit);
                    check(checkGamePass, i, userName);
                }
                break;
            default:
                break;
        }
    }
}

