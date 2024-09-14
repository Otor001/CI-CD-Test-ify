package Tasks;

public class Task7 {
    public static void main(String[] args) {
        // Create a 2D array with 4 rows and 3 columns
        String[][] fruits = new String[4][3];

        // Fill the first column (index 0) with fruits
        fruits[0][0] = "Apple";
        fruits[1][0] = "Banana";
        fruits[2][0] = "Orange";
        fruits[3][0] = "Mango";

        // Print the 2D array
        for (String[] fruit : fruits) {
            for (String s : fruit) {
                // Check if the current cell is null (empty)
                if (s != null) {
                    System.out.print(s + " ");
                } else {
                    System.out.print("Empty ");
                }
            }
            System.out.println();
        }
    }
}

