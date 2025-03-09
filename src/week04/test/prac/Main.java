package week04.test.prac;

public class Main {

    public static void main(String[] args) {
        boolean calculatedEnded = false;

        while (!calculatedEnded) {
            try {
                calculatedEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
