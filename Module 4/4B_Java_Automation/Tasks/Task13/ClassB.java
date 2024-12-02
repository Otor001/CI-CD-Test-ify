package Tasks.Task13;

public class ClassB {
    public static void main(String[] args) {
        ClassA object1 = new ClassA("Otor Emmanuel");
        ClassA object2 = new ClassA("Immaculate Mary", 10);
        ClassA object3 = new ClassA("Mary Pauline", 15, "Lagos");


        object1.displayInfo();
        object2.displayInfo();
        object3.displayInfo();
    }

}