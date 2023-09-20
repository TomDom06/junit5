# Calculator Unit Tests

This repository contains unit tests for the `Calculator` class using JUnit 5.

## How to Run Tests

To run the tests, follow these steps:

1. Clone this repository to your local machine.
2. Make sure you have JUnit 5 set up in your project.
3. Open the project in your IDE (e.g., IntelliJ IDEA, Eclipse).
4. Run the `CalculatorTest` class.

## Test Descriptions

- `testAdd`: Tests the `add` method of the `Calculator` class by adding two numbers. It expects the result to be 8 when adding 3 and 5.

- `testSubtract`: Tests the `subtract` method of the `Calculator` class by subtracting two numbers. It expects the result to be 7 when subtracting 3 from 10.

- `testMultiply`: Tests the `multiply` method of the `Calculator` class by multiplying two numbers. It expects the result to be 24 when multiplying 4 and 6.

- `testDivide`: Tests the `divide` method of the `Calculator` class by dividing two numbers. It expects the result to be 5.0 when dividing 10 by 2. Additionally, it checks that the method handles division by zero gracefully.

## Expected Results

All tests should pass successfully, indicating that the `Calculator` class functions correctly.

## Test Assumptions

- The `add`, `subtract`, and `multiply` methods are expected to work correctly for integer inputs.
- The `divide` method is expected to handle division by zero gracefully.
