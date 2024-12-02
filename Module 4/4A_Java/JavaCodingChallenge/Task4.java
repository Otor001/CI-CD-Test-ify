package JavaCodingChallenge;

public class Task4 {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }
        // Check if the number is divisible by any number from 2 to sqrt(num)
        for (int a = 2; a <= Math.sqrt(num); a++) {
            if (num % a == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        // Loop through numbers 1 to 100
        for (int a = 1; a <= 100; a++) {
            if (isPrime(a)) {
                System.out.print(a + " ");
            }
        }
    }
}
