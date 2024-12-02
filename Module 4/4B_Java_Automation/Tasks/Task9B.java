package Tasks;

import java.util.Scanner;

public class Task9B {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        // Loop until the user enters "testify"
        while (!userInput.equalsIgnoreCase("testify")) {
            System.out.print("Please enter the word: ");
            userInput = scanner.nextLine();  // Read input from the user

            // Check if the input is not "testify"
            if (!userInput.equalsIgnoreCase("testify")) {
                System.out.println("Try again");
            }
        }

        // Once "testify" is entered, exit the loop and print a success message
        System.out.println("You entered 'testify'! Program ends.");

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}