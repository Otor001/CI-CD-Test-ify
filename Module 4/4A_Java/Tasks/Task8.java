package Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Ask the user for the rate of interest (in percentage)
        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        // Ask the user for the time period (in years)
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate the simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result in a good sentence
        System.out.printf("The simple interest for a principal amount of %.2f with an interest rate of %.2f%% over %.2f years is %.2f.\n", principal, rate, time, simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
