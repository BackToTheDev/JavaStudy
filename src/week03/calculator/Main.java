package week03.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator;

        calculator = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(10, 3));

        calculator = new Calculator(new SubstractOperation());
        System.out.println(calculator.calculate(10, 4));

        calculator = new Calculator(new MultiplyOperation());
        System.out.println(calculator.calculate(5, 5));

        calculator = new Calculator(new DivideOperation());
        System.out.println(calculator.calculate(10, 2));

    }
}
