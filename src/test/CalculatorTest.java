package test;

import context.Calculator;
import strategy.AddStrategy;
import strategy.MultiplyStrategy;
import strategy.SubtractStrategy;

public class CalculatorTest {

    private Calculator calculator;

    public void setUp() {
        calculator = new Calculator();
    }

    private void assertCalculation(int expected, int a, int b) {
        int result = calculator.executeCalculation(a, b);
        if (result != expected) {
            throw new AssertionError("Expected " + expected + ", but got " + result);
        }
        System.out.println("Test passed: Result is " + expected);
    }

    public void testAddition() {
        System.out.print("Testing Addition: ");
        setUp();
        calculator.setStrategy(new AddStrategy());
        assertCalculation(15, 10, 5);
    }

    public void testSubtraction() {
        System.out.print("Testing Subtraction: ");
        setUp();
        calculator.setStrategy(new SubtractStrategy());
        assertCalculation(5, 10, 5);
    }

    public void testMultiplication() {
        System.out.print("Testing Multiplication: ");
        setUp();
        calculator.setStrategy(new MultiplyStrategy());
        assertCalculation(50, 10, 5);
    }

    public void testStrategyNotSetThrowsException() {
        System.out.print("Testing Exception when Strategy is null: ");
        setUp();
        try {
            calculator.executeCalculation(10, 5);
            throw new AssertionError("Expected IllegalStateException, but no exception was thrown.");
        } catch (IllegalStateException e) {
            System.out.println("Test passed: Exception handled correctly.");
        }
    }

    public static void main(String[] args) {
        CalculatorTest testSuite = new CalculatorTest();
        testSuite.testAddition();
        testSuite.testSubtraction();
        testSuite.testMultiplication();
        testSuite.testStrategyNotSetThrowsException();
    }
}