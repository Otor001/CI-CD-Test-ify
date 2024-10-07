package Tasks.Task16A;

public class ClassA {
        public class OverloadingExample {

            // Method 1: No parameters
            public void display() {
                System.out.println("Display method with no parameters.");
            }

            // Method 2: Overload by changing the number of parameters
            public void display(int a) {
                System.out.println("Display method with one integer parameter: " + a);
            }

            // Method 3: Overload by changing the type of parameters
            public void display(double a) {
                System.out.println("Display method with one double parameter: " + a);
            }

            // Method 4: Overload by changing the order of parameters
            public void display(int a, String b) {
                System.out.println("Display method with int and String parameters: " + a + ", " + b);
            }

            // Method 5: Changing order of parameters (String first, int second)
            public void display(String b, int a) {
                System.out.println("Display method with String and int parameters: " + b + ", " + a);
            }

            // Main method to invoke all overloaded methods
            public void main(String[] args) {
                OverloadingExample obj = new OverloadingExample();

                // Calling the overloaded methods
                obj.display();                  // Method with no parameters
                obj.display(10);                // Method with one integer parameter
                obj.display(15.5);              // Method with one double parameter
                obj.display(25, "Hello");       // Method with int and String parameters
                obj.display("World", 50);       // Method with String and int parameters
            }
        }
    }
