package Day20;


// Define custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        int age = 16; // Example input, you can change or take from user

        try {
            checkAge(age);
            System.out.println("Age is valid: " + age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to check age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}

// Create a program that:

// Defines a custom exception InvalidAgeException.

// In main, throw this exception if the age entered is less than 18.

// Catch the exception and print "Age must be 18 or above".