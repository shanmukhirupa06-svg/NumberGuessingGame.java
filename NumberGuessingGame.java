import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        String playAgain = "yes";

        System.out.println("Welcome to Number Guessing Game!");

        while (playAgain.equalsIgnoreCase("yes")) {

            int number = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            int maxAttempts = 7;

            System.out.println("\nGuess a number between 1 and 100.");
            System.out.println("You have 7 attempts.");

            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > number) {
                    System.out.println("Too High!");
                }
                else if (guess < number) {
                    System.out.println("Too Low!");
                }
                else {
                    System.out.println("Correct! You won!");
                    System.out.println("Attempts used: " + attempts);

                    score = score + (maxAttempts - attempts + 1) * 10;
                    break;
                }
            }

            if (guess != number) {
                System.out.println("You Lost!");
                System.out.println("Correct number was: " + number);
            }

            System.out.println("Your score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
        }

        System.out.println("Final Score: " + score);
        System.out.println("Thank you for playing!");

        sc.close();
    }
}