package app;

/**
 * Exception thrown when a negative integer is passed to the Calculator.
 */
public class NegativeIntegerException extends Exception {
    public NegativeIntegerException(String message) {
        super(message);
    }
}
