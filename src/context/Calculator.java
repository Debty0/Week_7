package context;

import strategy.CalculationStrategy;

public class Calculator {
    private CalculationStrategy strategy;

    public Calculator() {}

    public Calculator(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeCalculation(int a, int b) {
        if (strategy == null) {
            throw new IllegalStateException("Calculation strategy is not set.");
        }
        return strategy.execute(a, b);
    }
}