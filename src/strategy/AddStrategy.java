package strategy;

public class AddStrategy implements CalculatorStrategy {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
