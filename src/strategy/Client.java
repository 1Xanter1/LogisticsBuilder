package strategy;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println("Addition: " + calculator.calculate(5,1));

        calculator.setStrategy(new SubstractStrategy());
        System.out.println("Substraction: " + calculator.calculate(10,3));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " + calculator.calculate(10,4));

        calculator.setStrategy(new DivideStrategy());
        System.out.println("Divide: " + calculator.calculate(10,5));
        System.out.println("Divide by zero: " + calculator.calculate(10,0));
    }
}
