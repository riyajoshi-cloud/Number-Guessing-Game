import java.util.Scanner;
import java.util.Random;

public class number {
    public static void main(String[] args) {
        // --- Configuration ---
        int MIN_RANGE = 1;
        int MAX_RANGE = 100;
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Create a Random object for generating the secret number
        Random random = new Random();

        // Generate the secret number within the specified range
        int secretNumber = random.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between " + MIN_RANGE + " and " + MAX_RANGE + ". Try to guess it!");

        // Loop until the user guesses the correct number
        while (userGuess != secretNumber) {
            System.out.print("Enter your guess: ");
            
            // Validate input
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
                } else if (userGuess > secretNumber) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    System.out.println("Too low! Try a higher number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}

