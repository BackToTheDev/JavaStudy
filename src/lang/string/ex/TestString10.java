package lang.string.ex;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] first = fruits.split(",");
        for (int i = 0; i < first.length; i++) {
            String second = first[i];
            System.out.println(second);
        }

        String joinSecond = String.join("->", first);
        System.out.println("joinString: " + joinSecond);


    }
}
