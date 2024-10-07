package Tasks;

import java.util.Scanner;

public class Task10  {
    // Method to verify the user's intent
    public static void verifyVisitor() {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the word
        System.out.print("Why are you here? Please enter the reason: ");
        String userInput = scanner.nextLine();  // Read user input

        // Verify if the input is "Testify"
        if (userInput.equalsIgnoreCase("Testify")) {
            // Print welcome message
            System.out.println("Welcome to Testify Trainings! We're glad to have you.");
        } else {
            // Print rejection message
            System.out.println("Sorry, you're not allowed in this channel.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Main method
    public static void main(String[] args) {

        // Call the verifyVisitor method
        verifyVisitor();
    }
}

