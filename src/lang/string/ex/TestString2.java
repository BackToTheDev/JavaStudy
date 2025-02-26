package lang.string.ex;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            String name = arr[i];
             sum += name.length();
            System.out.println(name + ":" + name.length());
        }
        System.out.println("sum = " + sum);
    }
}
