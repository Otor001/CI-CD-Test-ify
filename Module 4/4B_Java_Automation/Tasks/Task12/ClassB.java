package Tasks.Task12;

public class ClassB {
    // Private method that can only be accessed within this class
    private void midName() {
        System.out.println("My mid name is Obriku");
    }

    // A public method inside Class B to demonstrate calling the private method
    public void callMidName() {
        callMidName(); // Accessing private method within the same class
    }
}
