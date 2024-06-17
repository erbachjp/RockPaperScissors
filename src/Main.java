import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userChoice = "Y";
        String userA;
        String userB;

        while (userChoice.equalsIgnoreCase("Y")) {
            do {
                System.out.println("Player 1 what is your choice? (R/P/S)");
                userA = scanner.nextLine().toUpperCase();
            } while (!userA.equals("R") && !userA.equals("P") && !userA.equals("S"));

            do {
                System.out.println("Player 2 what is your choice? (R/P/S)");
                userB = scanner.nextLine().toUpperCase();
            } while (!userB.equals("R") && !userB.equals("P") && !userB.equals("S"));

            if (userA.equals(userB)) {
                System.out.println("Tie!");
            } else if (userA.equals("R") && userB.equals("S")) {
                System.out.println("Player 1 Wins!");
            } else if (userA.equals("R")) {
                System.out.println("Player 2 Wins!");
            } else if (userA.equals("P") && userB.equals("S")) {
                System.out.println("Player 2 Wins!");
            } else if (userA.equals("P")) {
                System.out.println("Player 1 Wins!");
            } else if (userB.equals("R")) {
                System.out.println("Player 2 Wins!");
            } else {
                System.out.println("Player 1 Wins!");
            }

            System.out.println("Play again? (Y/N)");
            userChoice = scanner.nextLine().toUpperCase();
        }

        scanner.close();
    }
}