package lang.wrapper;

public class MyIntegerMethodMain {

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int date1 = myInteger.compareTo(5);
        int date2 = myInteger.compareTo(10);
        int date3 = myInteger.compareTo(20);

        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
        System.out.println("date3: " + date3);
    }
}
