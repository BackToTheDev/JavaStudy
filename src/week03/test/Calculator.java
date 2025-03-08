package week03.test;

public class Calculator {

    public double calculate(String operator, int firstNumber, int secondNumber) {
        if (operator.equals("plus")) {
            return firstNumber + secondNumber;
        } else if (operator.equals("minus")) {
            return firstNumber - secondNumber;
        } else if (operator.equals("divide")) {
            return firstNumber / secondNumber;
        } else if (operator.equals("remain")) {
            return firstNumber % secondNumber;
        } else {
            return firstNumber * secondNumber;
        }
    }
}
