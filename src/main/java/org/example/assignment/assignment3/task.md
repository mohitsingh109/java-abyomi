# Java Programming Assignment: Methods and Functions

## Objectives:
- Understand how to define and use methods/functions in Java.
- Learn method overloading.
- Practice passing parameters to methods.

## Instructions:

1. **Create a Class**:
    - **Class Name**: `MathOperations`

2. **Main Method**:
    - Implement all tasks within the `main` method of the `MathOperations` class.

## Scenario:
You are developing a simple mathematical operations utility. The utility should perform basic arithmetic operations, demonstrate method overloading, and handle different parameter types.

### Tasks:

### 1. Defining and Using Methods:
#### a. Create a method named `add`:
- **Parameters**: two integers (`int a`, `int b`).
- **Return Type**: `int`.
- **Functionality**: Return the sum of `a` and `b`.

#### b. Create a method named `subtract`:
- **Parameters**: two integers (`int a`, `int b`).
- **Return Type**: `int`.
- **Functionality**: Return the result of subtracting `b` from `a`.

#### c. Create a method named `multiply`:
- **Parameters**: two integers (`int a`, `int b`).
- **Return Type**: `int`.
- **Functionality**: Return the product of `a` and `b`.

#### d. Create a method named `divide`:
- **Parameters**: two integers (`int a`, `int b`).
- **Return Type**: `double`.
- **Functionality**: Return the result of dividing `a` by `b`. Handle division by zero by returning `Double.POSITIVE_INFINITY`.

### 2. Method Overloading:
#### a. Overload the `add` method:
- **Parameters**: three integers (`int a`, `int b`, `int c`).
- **Return Type**: `int`.
- **Functionality**: Return the sum of `a`, `b`, and `c`.

#### b. Overload the `subtract` method:
- **Parameters**: three integers (`int a`, `int b`, `int c`).
- **Return Type**: `int`.
- **Functionality**: Return the result of subtracting `b` and `c` from `a`.

### 3. Passing Parameters:
#### a. Create a method named `printResult`:
- **Parameters**: a string (`String operation`) and a double (`double result`).
- **Return Type**: `void`.
- **Functionality**: Print the operation name and result in the format: `Operation: <operation>, Result: <result>`.
