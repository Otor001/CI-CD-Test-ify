package JavaCodingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    // Function to check if two words are anagrams
    public static boolean areAnagrams(String word1, String word2) {
        // Remove any non-alphabetical characters and convert to lowercase
        word1 = word1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        word2 = word2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if the lengths of the words are the same
        if (word1.length() != word2.length()) {
            return false;
        }

        // Convert the words to character arrays and sort them
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    // Function to find and print anagram pairs in a sentence
    public static void findAnagrams(String sentence) {
        // Split the sentence into words (using space and punctuation as delimiters)
        String[] words = sentence.split("\\W+");

        // List to store anagram pairs
        List<String[]> anagramPairs = new ArrayList<>();

        // Compare every pair of words to check for anagrams
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (areAnagrams(words[i], words[j])) {
                    anagramPairs.add(new String[]{words[i], words[j]});
                }
            }
        }

        // Print the found anagram pairs
        if (anagramPairs.size() > 0) {
            System.out.println("Anagram pairs found in the sentence:");
            for (String[] pair : anagramPairs) {
                System.out.println(pair[0] + " - " + pair[1]);
            }
        } else {
            System.out.println("No anagrams found in the sentence.");
        }
    }

    public static void main(String[] args) {
        // Input sentence
        String sentence = "Despite commuting at the peek hour, she was able to keep to time";

        // Find and print anagram pairs
        findAnagrams(sentence);
    }
}
