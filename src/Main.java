import context.Calculator;
import strategy.AddStrategy;
import strategy.MultiplyStrategy;
import strategy.SubtractStrategy;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        calculator.setStrategy(new AddStrategy());
        System.out.println("10 + 5 = " + calculator.executeCalculation(a, b));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("10 - 5 = " + calculator.executeCalculation(a, b));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("10 * 5 = " + calculator.executeCalculation(a, b));
    }
}