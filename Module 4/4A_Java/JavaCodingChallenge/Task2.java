package JavaCodingChallenge;

public class Task2 {
    // Recursive function to reverse the words in a sentence
    public static String reverseWords(String sentence) {
        // Base case: If the sentence is empty or contains no spaces, return the sentence
        if (!sentence.contains(" ")) {
            return sentence;
        }

        // Find the first space in the sentence
        int spaceIndex = sentence.indexOf(" ");

        // Recursively reverse the remaining words after the first space
        return reverseWords(sentence.substring(spaceIndex + 1)) + " " + sentence.substring(0, spaceIndex);
    }

    public static void main(String[] args) {
        String sentence = "I am the best Automation Tester";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }
}
