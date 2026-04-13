# Calculator module

## Description

This thing should add print reset and print values, and prints an error when adding fails.

## Code

`package app;

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
}`

## Explanation of the code *By Copilot*

### Class Overview
The `Calculator` class serves as the **Model** in the MVC (Model-View-Controller) architectural pattern. It encapsulates the core business logic for managing a sum of positive integers, with built-in validation to prevent negative values from being added.

### Instance Variable
```java
private int currentValue;
```
- **`currentValue`**: A private integer that stores the running total of all added values
- The `private` modifier ensures this variable can only be accessed through the class's public methods, protecting data integrity
- Initialized to `0` by default

### Constructor
```java
public Calculator() {
    this.currentValue = 0;
}
```
- Creates a new Calculator instance with the sum initialized to zero
- Uses `this.currentValue` to explicitly refer to the instance variable, making the code more readable
- No parameters required; every Calculator starts fresh at zero

### reset() Method
```java
public void reset() {
    this.currentValue = 0;
}
```
- **Purpose**: Clears the calculator by resetting the current value back to zero
- **Return type**: `void` (no value returned)
- Useful for starting a new calculation without creating a new Calculator object

### add(int value) Method
```java
public void add(int value) throws NegativeIntegerException {
    if (value < 0) {
        throw new NegativeIntegerException("Cannot add negative integer: " + value);
    }
    this.currentValue += value;
}
```
- **Purpose**: Adds a positive integer to the current sum
- **Parameter**: `value` - the integer to add
- **Exception Handling**:
  - `throws NegativeIntegerException` declares that this method may throw a custom exception
  - The `if` condition validates that the value is non-negative (≥ 0)
  - If a negative number is passed, the method immediately throws an exception with a descriptive error message
  - This prevents invalid data from corrupting the calculator's state
- **Addition**: If validation passes, `currentValue += value` adds the integer to the running total
- The `+=` operator is shorthand for `currentValue = currentValue + value`

### getValue() Method
```java
public int getValue() {
    return this.currentValue;
}
```
- **Purpose**: Retrieves the current sum stored in the calculator
- **Return type**: `int` (returns the current total)
- Provides read-only access to the internal state without allowing direct modification
- Called whenever the View needs to display the current value

### Key Design Principles
1. **Encapsulation**: The internal `currentValue` is hidden from outside access; only controlled methods can modify it
2. **Validation**: Negative integers are rejected at the entry point (`add`), preventing invalid states
3. **Separation of Concerns**: The Calculator focuses purely on the math logic; display and user interaction are handled by the View and Controller components
