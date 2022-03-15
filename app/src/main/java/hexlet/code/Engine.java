package hexlet.code;

public class Engine {
    public static void engine(int choiceGame) {
        String userName;
        final int maxRound = 3;
        switch (choiceGame) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                userName = Cli.getName();
                break;
            case 2:
                System.out.println("Welcome to the Brain Games!");
                userName = Cli.getName();
                for (int i = 0; i < maxRound; i++) {
                    final int randUpperLimit = 10;
                    int randomNumber = (int) (Math.random() * randUpperLimit);
                    boolean gameReturn = Parity.parityGame(randomNumber);
                    if (gameReturn) {
                        System.out.println("Let's try again, " + userName + "!");
                        break;
                    }
                    System.out.println("Correct!");
                    if (i == 2) {
                        System.out.println("Congratulations, " + userName + "!");
                    }
                }
                break;
            case 3:
                System.out.println("Welcome to the Brain Games!");
                userName = Cli.getName();
                for (int i = 0; i < maxRound; i++) {
                    final int randUpperLimit = 10;
                    int randomNumber = (int) (Math.random() * randUpperLimit);
                    boolean gameReturn = Calc.calcGame(i, randomNumber);
                    if (gameReturn) {
                        System.out.println("Let's try again, " + userName + "!");
                        break;
                    }
                    System.out.println("Correct!");
                    if (i == 2) {
                        System.out.println("Congratulations, " + userName + "!");
                    }
                }
                break;
            default:
                break;
        }
    }
}

