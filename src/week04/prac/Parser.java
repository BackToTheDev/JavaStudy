package week04.prac;

import java.util.regex.Pattern;

public class Parser {

    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception{
        if (!Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException("제발 정수값");
        }

        int number = Integer.parseInt(firstInput);
         this.calculator.setFirstNumber(number);
         return this;
    }

    public Parser parseSecondNum(String secondInput) throws Exception{
        // 구현2.
        if (!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("정수값");
        }
        int number = Integer.parseInt(secondInput);
        calculator.setSecondNumber(number);
        return this;
    }

    public Parser parseOperator(String operationInput) throws Exception{
        // 구현 1.
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("연산자");
        }

        if (operationInput.equals("+")) {
            this.calculator.setOperation(new AddOperation());
        } else if (operationInput.equals("-")) {
            this.calculator.setOperation(new SubstractOperation());
        } else if (operationInput.equals("*")) {
            this.calculator.setOperation(new MultiplyOperation());
        } else if (operationInput.equals("/")) {
            this.calculator.setOperation(new DivideOperation());
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
