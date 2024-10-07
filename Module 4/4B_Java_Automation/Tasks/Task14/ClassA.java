package Tasks.Task14;

public class ClassA {
    // Variable for the number of sides of a square (always 4)
    private final int shapeSides = 4;

    // Variables for length and breadth
    private double length;
    private double breadth;

    // Getter for shapeSides (no setter, since it's always 4)
    public int getShapeSides() {
        return shapeSides;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for breadth
    public double getBreadth() {
        return breadth;
    }

    // Setter for breadth
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}

