package JavaCodingChallenge;

public class Task7 {
    // Recursive function to reverse a string
    public static String reverseString(String str) {
        // Base case: If the string is empty, return the empty string
        if (str.isEmpty()) {
            return str;
        }

        // Recursive case: Take the last character and append the reverse of the remaining string
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        // Input string
        String input = "TestifyAutomation";

        // Call the recursive function to reverse the string
        String reversed = reverseString(input);

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}

