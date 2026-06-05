import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int maxAttempts = 5;
        boolean guessedCorrectly = false;

        System.out.println("=========================================");
        System.out.println("        NUMBER GUESSING GAME");
        System.out.println("=========================================");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have only 5 attempts.");
        System.out.println("=========================================\n");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {

            System.out.print("Attempt " + attempt + " - Enter Your Guess: ");
            guess = sc.nextInt();

            if (guess == secretNumber) {
                System.out.println("\nCongratulations! You guessed the correct number.");
                guessedCorrectly = true;
                break;
            } else if (guess > secretNumber) {
                System.out.println("Too High!");
            } else {
                System.out.println("Too Low!");
            }

            System.out.println("Attempts Remaining: " + (maxAttempts - attempt));
            System.out.println();
        }

        if (!guessedCorrectly) {
            System.out.println("=========================================");
            System.out.println("Game Over!");
            System.out.println("The Correct Number Was: " + secretNumber);
            System.out.println("=========================================");
        }

        System.out.println("\nThank You For Playing!");

        sc.close();
    }
}