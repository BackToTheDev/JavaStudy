package week04.test.prac;

import java.util.regex.Pattern;

public class Parser {

    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parserFirstNum(String firstInput) throws Exception{
        if (!Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException("숫자");
        }
        int number = Integer.parseInt(firstInput);
        this.calculator.setFirstNumber(number);
        return this;
    }

    public Parser parserSecondNum(String secondInput) throws Exception{
        if (!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("숫자");
        }
        int number = Integer.parseInt(secondInput);
        this.calculator.setSecondNumber(number);
        return this;
    }

    public Parser parserOperator(String operationInput) throws Exception{
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("연산자");
        }
        switch (operationInput) {
            case "+" -> this.calculator.setOperation(new AddOperation());
            case "-" -> this.calculator.setOperation(new SubstractOperation());
            case "*" -> this.calculator.setOperation(new MultiplyOperation());
            case "/" -> this.calculator.setOperation(new DivideOperation());
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
