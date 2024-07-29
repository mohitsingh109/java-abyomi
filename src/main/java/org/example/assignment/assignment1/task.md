# Assignment: Implement Arithmetic Operations

## Objectives:
- Implement basic arithmetic operations.
- Use variables and different data types.
- Understand and demonstrate operator precedence.
- Use increment and decrement operators.
- Construct and evaluate complex expressions.

## Instructions:

1. **Create a Class**:
    - **Class Name**: `ArithmeticOperations`

2. **Main Method**:
    - Implement all the operations and complex expressions within the `main` method of the `ArithmeticOperations` class.

3. **Detailed Tasks**:

   ### 1. Basic Arithmetic Operations:
    - Implement addition, subtraction, multiplication, division, and modulus operations.
    - Example:
      ```java
      int sum = 15 + 25;
      int difference = 200 - 75;
      int product = 6 * 7;
      int quotient = 144 / 12;
      int remainder = 45 % 7;
      ```

   ### 2. Using Variables:
    - Declare integer variables and perform arithmetic operations using these variables.
    - Example:
      ```java
      int num1 = 30;
      int num2 = 15;
      int combinedSum = num1 + num2;
      ```

   ### 3. Different Data Types:
    - Perform arithmetic operations using `int`, `long`, and `float` data types.
    - Example:
      ```java
      long combinedSumLong = 15L + 30L;
      float combinedSumFloat = 5.5f + 10.5f;
      ```

   ### 4. Operator Precedence:
    - Demonstrate the use of parentheses to control the order of operations.
    - Show the effect of operator precedence in complex expressions without parentheses.
    - Example:
      ```java
      int result1 = 100 - 5 * 4; // Expected: 80
      int result2 = 20 + 10 * 5 / 2 + 2 * 2; // Expected: 49
      int result3 = 5 * 2 - 10 / 2 + 4 * 6; // Expected: 29
      int result4 = 10 - 100 + 20 - 20 - 40; // Expected: -130
      ```

   ### 5. Increment and Decrement Operators:
    - Use increment (`++`) and decrement (`--`) operators to modify the value of an integer.
    - Example:
      ```java
      int i = 10;
      i++; // i is now 11
      i += 1; // i is now 12
      i--; // i is now 11
      i -= 1; // i is now 10
      ```

   ### 6. Complex Expressions:
    - Construct and evaluate complex expressions involving multiple arithmetic operations, including the use of `i++`.
    - Example:
      ```java
      int i = 10;
      int complexResult1 = 50 / 5 * 3 - 92 % 9 + 100 / 10 * 2;
      int complexResult2 = 15 % 4 * 5 - 10 / 2 * 5 + 5 / -2 * 2;
      int complexResult3 = 7 % 5 * -5 + 20 / 5 * 2 + 4 / 2 * (4 + 1) / 2;
      int complexResult4 = 11 % -7 + 10 + (14 - 6) / 2 * 2;
      int complexResult5 = (i++ * 5) + 10 - 3 * (i-- / 2);
      int complexResult6 = (i++ + 10) * (5 + i--) - 2 * i;
      ```