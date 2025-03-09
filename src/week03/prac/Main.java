package week03.prac;

public class Main {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        calculate.setOperation(new AddOperation());
        System.out.println(calculate.calculate(10, 5));

        calculate.setOperation(new SubstractOperation());
        System.out.println(calculate.calculate(10, 5));

        calculate.setOperation(new MultiplyOperation());
        System.out.println(calculate.calculate(10, 5));

        calculate.setOperation(new DivideOperation());
        System.out.println(calculate.calculate(10, 5));


    }
}
