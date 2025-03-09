package week03.prac;

public class Calculate {

    private AbstractOperation operation;

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }
}
