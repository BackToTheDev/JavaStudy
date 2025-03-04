package week03.calculator;

public class Calculator {

AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }



    double calculate( int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }
}
