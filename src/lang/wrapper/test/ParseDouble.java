package lang.wrapper.test;

import static java.lang.Double.parseDouble;

public class ParseDouble {

    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            double parseDouble = Double.parseDouble(array[i]);
            sum += parseDouble;
        }
        System.out.println("sum = " + sum);
    }
}
