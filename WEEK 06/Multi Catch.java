class MultipleCatchExample {
    void divide() {
        try {
            // Array with 3 elements
            int[] numbers = {1, 2, 3};

            // Comment out the division by zero to prevent ArithmeticException
            int result = numbers[1] / 0;

            // This will throw an ArrayIndexOutOfBoundsException
            System.out.println("Fourth element: " + numbers[3]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }
        finally{
            System.out.println("Execution completed");
        }
    }
}

public class exception {
    public static void main(String[] args) {
        MultipleCatchExample obj = new MultipleCatchExample();
        obj.divide();
    }
}
