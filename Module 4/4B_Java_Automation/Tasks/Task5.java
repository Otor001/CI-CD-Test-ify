package Tasks;

public class Task5 {
    public static void main(String[] args) {
        // Loop through numbers 1 to 100 (or any range)

        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Otherwise, print the number
            else {
                System.out.println(i);
            }
        }
    }
}

