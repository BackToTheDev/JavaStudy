package week03.cal1;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.calculate("add", 5, 2);
        calculator.calculate("sub", 5, 2);
        calculator.calculate("mul", 5, 2);
        calculator.calculate("divine", 5, 2);
    }
}
