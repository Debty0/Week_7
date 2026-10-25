package strategy;

public class AddStrategy implements CalculationStrategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}