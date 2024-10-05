package JavaCodingChallenge;

import java.util.Arrays;

public class Task3 {
    // Function to find the maximum product of two numbers in an array
    public static int[] findMaxProduct(int[] arr) {
        // If the array has fewer than 2 elements, return null (not enough numbers)
        if (arr.length < 2) {
            return null;
        }

        // Sort the array
        Arrays.sort(arr);

        // Two possible cases for maximum product:
        // 1. The product of the two largest positive numbers (arr[n-1] * arr[n-2])
        // 2. The product of the two smallest negative numbers (arr[0] * arr[1])
        int n = arr.length;
        int product1 = arr[n - 1] * arr[n - 2]; // Two largest elements
        int product2 = arr[0] * arr[1]; // Two smallest elements (could be negative)

        // Return the pair with the maximum product
        if (product1 > product2) {
            return new int[]{arr[n - 2], arr[n - 1]}; // Largest elements
        } else {
            return new int[]{arr[0], arr[1]}; // Smallest elements (negative numbers)
        }
    }
    public static void main(String[] args) {
        int[] arr = {-10, -3, 5, 6, -20};
        int[] result = findMaxProduct(arr);

        if (result != null) {
            System.out.println("The two numbers with the maximum product are: " + result[0] + " and " + result[1]);
            System.out.println("Their product is: " + (result[0] * result[1]));
        } else {
            System.out.println("Array does not have enough elements.");
        }
    }
}

