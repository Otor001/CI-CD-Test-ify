package Task19C;

public class ClassB extends ClassA {
    String name = "Anderson";

    public static void main(String[] args) {
        ClassB object = new ClassB();

        object.printName();
    }

    public void printName() {
        System.out.println("My Class A is " + super.name);

        System.out.println("My class B is " + name);
    }
}
