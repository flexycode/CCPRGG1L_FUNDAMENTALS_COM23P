// import the Scanner class
import java.util.Scanner;

public class BlockchainGame {
    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Blockchain Game!");
        System.out.println("Enter your name: ");
        String playerName = scan.nextLine();

        int score = playGame();

        System.out.println("Congratulations, " + playerName + "! Your final score is: " + score);
        System.out.println("Your score will now be recorded on the blockchain.");

        // Code to record the score on the blockchain

        System.out.println("Thank you for playing the Blockchain Game!");
        scan.close();
    }

    static int playGame() {
        int score = 0;

        System.out.println("Let's play the game!");

        // Game logic goes here
        // Increment the score based on player's performance

        return score;
    }
}