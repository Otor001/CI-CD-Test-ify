package Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task18 {
    public class validInput {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int age = 0;
            boolean validInput = false;

            // Loop until a valid integer age is entered
            while (!validInput) {
                try {
                    System.out.print("Please enter your age: ");
                    age = scanner.nextInt();  // Get integer input for age
                    validInput = true;  // If input is valid, exit the loop
                } catch (InputMismatchException e) {
                    // If a non-integer is entered, catch the exception
                    System.out.println("Invalid input. Please enter a valid integer for age.");
                    scanner.next();  // Clear the invalid input from the scanner
                }
            }

            // Print the valid age
            System.out.println("Your age is: " + age);
            scanner.close();  // Close the scanner
        }
    }
}
