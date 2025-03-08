package week03.test;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double plus = calculator.calculate("plus", 5, 2);
        System.out.println(plus);

        double minus = calculator.calculate("minus", 5, 2);
        System.out.println(minus);

        double divide = calculator.calculate("divide", 5, 2);
        System.out.println(divide);

        double multiple = calculator.calculate("multiple", 5, 2);
        System.out.println(multiple);

        double remain = calculator.calculate("remain", 5, 2);
        System.out.println(remain);

    }


}
