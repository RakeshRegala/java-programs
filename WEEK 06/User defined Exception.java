// User-defined exception class
class InvalidAgeException extends Exception {
    // Constructor that takes a custom error message
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class with method that throws the custom exception
class AgeValidator {
    // Method to validate age
    public void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throw custom exception if age is less than 18
            throw new InvalidAgeException("Age is not valid to vote. Must be 18 or older.");
        } else {
            System.out.println("Welcome! You are eligible to vote.");
        }
    }
}

public class UserDefinedExceptionTest {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        // Testing the custom exception
        try {
            validator.validate(16);  // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            validator.validate(20);  // This will pass the validation
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
