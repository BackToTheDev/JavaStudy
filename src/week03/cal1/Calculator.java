package week03.cal1;

public class Calculator {

    AddOperation add = new AddOperation();
    SubstractOperation sub = new SubstractOperation();
    MultiplyOperation mul = new MultiplyOperation();
    DivideOperation divide = new DivideOperation();

    public void calculate(String operate, int firstNumber, int secondNumber) {
        if (operate.equals("add")) {
           double plus = add.operate(firstNumber, secondNumber);
            System.out.println(plus);
        } else if (operate.equals("sub")) {
            double minus = sub.operate(firstNumber, secondNumber);
            System.out.println(minus);
        } else if (operate.equals("mul")){
            double multiply = mul.operate(firstNumber, secondNumber);
            System.out.println(multiply);
        } else {
            double divine = divide.operate(firstNumber, secondNumber);
            System.out.println(divine);
        }
    }
}
