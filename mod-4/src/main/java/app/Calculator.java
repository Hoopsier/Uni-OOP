package app;

/**
 * Calculator class that acts as the model in the MVC pattern.
 * Handles the sum of positive integers with validation for negative values.
 */
public class Calculator {
    private int currentValue;

    /**
     * Constructs a Calculator with an initial value of zero.
     */
    public Calculator() {
        this.currentValue = 0;
    }

    /**
     * Resets the calculator to zero.
     */
    public void reset() {
        this.currentValue = 0;
    }

    /**
     * Adds an integer to the calculator.
     * 
     * @param value the integer to add (must be non-negative)
     * @throws NegativeIntegerException if the value is negative
     */
    public void add(int value) throws NegativeIntegerException {
        if (value < 0) {
            throw new NegativeIntegerException("Cannot add negative integer: " + value);
        }
        this.currentValue += value;
    }

    /**
     * Returns the current value of the calculator.
     * 
     * @return the current sum
     */
    public int getValue() {
        return this.currentValue;
    }
}
