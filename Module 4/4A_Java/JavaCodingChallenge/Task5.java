package JavaCodingChallenge;

import java.util.*;

public class Task5 {
    // Function to group anagrams from the given input array
    public static List<List<String>> groupAnagrams(String[] words) {
        // Create a map to store sorted words as keys and list of anagrams as values
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each word in the input array
        for (String word : words) {
            // Convert the word to a char array, sort it, and convert it back to a string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // If the sorted word is not yet a key in the map, add it with an empty list
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            // Add the original word to the corresponding list of anagrams
            map.get(sortedWord).add(word);
        }

        // Return the list of all anagram groups
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        // Input array of words
        String[] words = {"akka", "akak", "baab", "baba", "bbaa"};

        // Get the anagram buckets
        List<List<String>> result = groupAnagrams(words);

        // Print each group of anagrams
        System.out.println("Anagram buckets:");
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}

