package strategy;

public class MultiplyStrategy implements CalculatorStrategy {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
