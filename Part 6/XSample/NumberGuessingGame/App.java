import java.util.Scanner;

public class NumberGuessingGame {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");

        int secretNumber = generateSecretNumber();
        int attempts = 0;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scan.nextInt();
            scan.nextLine(); // Consume the newline character

            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                guessedCorrectly = true;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scan.close();
    }

    static int generateSecretNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
