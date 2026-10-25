package strategy;

public class SubtractStrategy implements CalculationStrategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}