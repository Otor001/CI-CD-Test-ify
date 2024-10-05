package Tasks;

public class Task3 {
    public static void main(String[] args) {
        // Storing the age in a variable
        int age = 34;

        // Method 1: Using the + operator for concatenation
        String message1 = "I am " + age + " years old.";
        System.out.println(message1);

        // Method 2: Using String.format() for concatenation
        String message2 = String.format("I am %d years old.", age);
        System.out.println(message2);
    }
}
