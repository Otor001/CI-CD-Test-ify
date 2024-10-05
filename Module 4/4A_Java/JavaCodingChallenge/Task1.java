package JavaCodingChallenge;

public class Task1 {
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            // Compare characters from the beginning and end
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;  // Not a palindrome
            }
        }
        return true;  // It's a palindrome
    }

    public static void main(String[] args) {
        // Check if "racecar" is a palindrome
        String word = "racecar";
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        // Check if 10801 is a palindrome (convert number to string first)
        int number = 10801;
        String numberString = Integer.toString(number);
        if (isPalindrome(numberString)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

