class BuiltInExceptionsDemo {
    void arithmeticExceptionExample() {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    void arrayIndexOutOfBoundsExceptionExample() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    void nullPointerExceptionExample() {
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}

public class BuiltInExceptionsTest {
    public static void main(String[] args) {
        BuiltInExceptionsDemo demo = new BuiltInExceptionsDemo();

        // Triggering various built-in exceptions
        demo.arithmeticExceptionExample();
        demo.arrayIndexOutOfBoundsExceptionExample();
        demo.nullPointerExceptionExample();
    }
}
