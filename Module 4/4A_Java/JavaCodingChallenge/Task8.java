package JavaCodingChallenge;

import java.util.Arrays;

public class Task8 {
    // Function to sort the array using counting sort
    public static void countingSort(int[] arr) {
        // Create a count array for numbers between 1 and 9 (inclusive)
        int[] count = new int[10]; // 0 is unused, as numbers are from 1 to 9

        // Step 1: Count the occurrences of each number in the input array
        for (int num : arr) {
            count[num]++;
        }

        // Step 2: Use the count array to reconstruct the sorted array
        int index = 0;
        for (int i = 1; i <= 9; i++) { // Numbers range from 1 to 9
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        // Example: A collection of 1 million integers (for the sake of example, I'll use a smaller size)
        int[] arr = {5, 3, 9, 1, 2, 9, 8, 1, 3, 2, 7, 9, 4}; // Replace with a larger array for 1 million integers

        System.out.println("Original array: " + Arrays.toString(arr));

        // Sorting the array using counting sort
        countingSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
