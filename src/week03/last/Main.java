package week03.last;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperation(new AddOperation());
        System.out.println(calculator.calculate(5, 3));

        calculator.setOperation(new SubstractOperation());
        System.out.println(calculator.calculate(5, 3));

        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(5, 3));

        calculator.setOperation(new DivideOperation());
        System.out.println(calculator.calculate(5, 3));
    }
}
