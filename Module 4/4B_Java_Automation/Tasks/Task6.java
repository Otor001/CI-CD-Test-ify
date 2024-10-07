package Tasks;

public class Task6 {
    public static void main(String[] args) {
        // Original string
        String original = "DEMOCRACY";

        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        // Extract the substring "COME" from the reversed string
        String extracted = reversed.substring(1, 5);  // "COME" is found from index 1 to 4


        // Print the result
        //System.out.println("Reversed string: " + reversed);
       // System.out.println("Extracted word: " + extracted);
    }
}

