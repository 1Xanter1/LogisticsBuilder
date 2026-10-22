package strategy;

public class Calculator {
    private CalculatorStrategy strategy;

    public Calculator(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double a, double b) {
        return strategy.execute(a, b);
    }

    public void setStrategy(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }
}
