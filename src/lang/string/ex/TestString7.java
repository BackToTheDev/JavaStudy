package lang.string.ex;

public class TestString7 {

    public static void main(String[] args) {
        String original = "         Hello Java     ";

        String odin = original.strip();
        System.out.println(odin);
    }
}
