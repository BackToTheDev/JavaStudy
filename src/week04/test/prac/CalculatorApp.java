package week04.test.prac;

import java.util.Scanner;

public class CalculatorApp {

    public static boolean start() throws Exception {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요!");
        String firstInput = scanner.nextLine();
        parser.parserFirstNum(firstInput);

        System.out.println("연산자를 입력해주세요!");
        String operation = scanner.nextLine();
        parser.parserOperator(operation);

        System.out.println("두번째 숫자를 입력해주세요!");
        String secondInput = scanner.nextLine();
        parser.parserSecondNum(secondInput);

        System.out.println("연산 결과 : " + parser.executeCalculator());
        return true;
    }
}
