package lang.string.ex;

public class TestString18 {

    public static void main(String[] args) {
        String str = "Hello Java";

        String result = new StringBuilder(str).reverse().toString();
        System.out.println(result);
    }
}
