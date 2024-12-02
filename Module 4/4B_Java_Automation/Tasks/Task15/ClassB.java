package Tasks.Task15;
public class ClassB extends ClassA{
    // Method 1 in class B
    public void fatherRace() {
        System.out.println("My father is black");
    }

    // Method 2 in class B
    public void fatherReligion() {
        System.out.println("My father is a catholic");
    }

    // Main method to invoke all 5 methods
    public static void main(String[] args) {
        // Create an object of class B (child class)
        // Create an instance of Class B
        ClassB father = new ClassB();

        father.fatherName();
        father.FatherOccupation();
        father.fatherOrigin();

        // Invoke methods from Class B
        father.fatherRace();
        father.fatherReligion();
    }
}
