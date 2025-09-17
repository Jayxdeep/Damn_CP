package random;
public class SimpleClass {

    // Fields (attributes) without private access modifier
    int number;
    String text;

    // Constructor
    public SimpleClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Number: " + number + ", Text: " + text);
    }

    // Main method for testing the class
    public static void main(String[] args) {
        // Creating an object of SimpleClass
        SimpleClass example = new SimpleClass(10, "Hello");

        // Accessing and modifying fields directly
        System.out.println("Number: " + example.number); // Output: Number: 10
        example.number = 20;
        System.out.println("Modified Number: " + example.number); // Output: Modified Number: 20

        // Displaying information using an instance method
        example.displayInfo(); // Output: Number: 20, Text: Hello
    }
}


