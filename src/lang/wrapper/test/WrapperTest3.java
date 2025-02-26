package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";

        Integer integer = Integer.valueOf(str);
        int i = integer.intValue();
        Integer integer1 = Integer.valueOf(i);


        System.out.println("integer = " + integer);
        System.out.println("intValue = " + i);
        System.out.println("integer1 = " + integer1);
    }
}
