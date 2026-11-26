import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int round = 0;
        int score = 0;
        String playAgain;

        do {

            round++;

            int number = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            int maxAttempts = 7;

            boolean won = false;

            System.out.println("\n===== NUMBER GUESSING GAME =====");
            System.out.println("Round: " + round);
            System.out.println("Guess a number between 1 and 100.");
            System.out.println("You have 7 attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                System.out.println("Attempts used: " + attempts);

                if (guess > number) {
                    System.out.println("Too High!");
                }
                else if (guess < number) {
                    System.out.println("Too Low!");
                }
                else {
                    System.out.println("Correct! You won!");
                    won = true;
                    score++;
                    break;
                }
            }

            if (!won) {
                System.out.println("You Lost!");
                System.out.println("The correct number was: " + number);
            }

            System.out.println("Round " + round +
                    " — attempts used: " + attempts);

            System.out.println("Total rounds won: " + score);

            System.out.print("Do you want to Play Again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\n===== FINAL RESULT =====");
        System.out.println("Total rounds played: " + round);
        System.out.println("Total rounds won: " + score);

        sc.close();
    }
}
