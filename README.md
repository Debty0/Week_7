# Assignment 5: Strategy Pattern

## Description
This repository contains the implementation of the Strategy behavioral design pattern in Java, completing Option B (Calculator). The goal of this project is to eliminate conditional logic (`if`/`switch` statements) when selecting mathematical operations by encapsulating each algorithm into its own interchangeable strategy class.

## Folder Structure
* `src/strategy/`: Contains the `CalculationStrategy` interface and concrete implementations (`AddStrategy`, `SubtractStrategy`, `MultiplyStrategy`).
* `src/context/`: Contains the `Calculator` context class.
* `src/Main.java`: The client application that configures strategies and injects them into the context.
* `src/test/`: Contains `CalculatorTest.java` for unit testing.

## Clean Code Principles Applied (Chapters 9, 10, 11)
1. **Single Responsibility Principle (Ch. 10):** Each strategy class is only responsible for one specific mathematical operation.
2. **Small Classes Organized for Change (Ch. 10):** The `Calculator` context is extremely small, cohesive, and completely algorithm-agnostic.
3. **Separation of Main (Ch. 11):** The `Main` class acts as the dependency injector, decoupling the construction of strategies from their usage in the context.
4. **Domain-Specific Testing Language (Ch. 9):** Unit tests use helper methods (e.g., `assertCalculation()`) to make tests expressive and readable.
5. **F.I.R.S.T. Principles (Ch. 9):** Unit tests are independent and repeatable; `setUp()` creates a fresh `Calculator` instance before every test.

## How to Run
1. Open the project in IntelliJ IDEA (JDK 17).
2. Run `Main.java` to see runtime strategy switching.
3. Run `test/CalculatorTest.java` to execute the unit tests.