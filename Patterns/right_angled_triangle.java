import java .util.*;
public class star {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle
        
        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing spaces before asterisks
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); // Print spaces for alignment
            }
            // Inner loop for printing asterisks in each row
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
