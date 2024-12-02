package Tasks;

public class Task2 {
    public static void main(String[] args) {

        // Declaring variables of different data types

        String name = "Alice";         // String

        int age = 30;                  // Integer

        boolean isStudent = true;      // Boolean

        double gpa = 3.75;             // Double (floating point number)

        char grade = 'A';              // Character

        String[] hobbies = {"Reading", "Coding"};  // Array of Strings

        // Printing all variables to the console
        System.out.println("String: " + name);
        System.out.println("Integer: " + age);
        System.out.println("Boolean: " + isStudent);
        System.out.println("Double: " + gpa);
        System.out.println("Character: " + grade);
        System.out.println("Array: " + String.join(", ", hobbies));
    }
}

