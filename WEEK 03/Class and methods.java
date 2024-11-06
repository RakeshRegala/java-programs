class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }
}

// Main class
public class C {
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calc = new Calculator();

        // Invoke methods of Calculator
        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);
       

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
