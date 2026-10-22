package strategy;

public class SubstractStrategy implements CalculatorStrategy {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
