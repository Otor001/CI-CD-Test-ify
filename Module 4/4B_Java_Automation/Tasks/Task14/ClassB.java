package Tasks.Task14;

public class ClassB {
    public static void main(String[] args) {
        // Create an object of Class A (Square shape)
        ClassA square = new ClassA();

        // Set the length and breadth values
        square.setLength(5.0);
        square.setBreadth(5.0);

        // Get the length and breadth
        double length = square.getLength();
        double breadth = square.getBreadth();

        // Calculate the area of the square
        double area = length * breadth;

        // Print out the result
        System.out.println("The area of a square of length: " + length
                + " and breadth: " + breadth + " is " + area);
    }
}

