package strategy;

public class DivideStrategy implements CalculatorStrategy
{
    @Override
    public double execute(double a, double b) {
        if(a == 0 || b == 0){
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }
}
