package lang.string.ex;

public class TestString16 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] fruit = fruits.split(",");
        String apple = fruit[0];
        String banana = fruit[1];
        String mango = fruit[2];

        for (String s : fruit) {
            System.out.println(s);
        }
        String joinedString = String.join("->", fruit);
        System.out.println(joinedString);
    }
}
