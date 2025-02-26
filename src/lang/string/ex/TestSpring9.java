package lang.string.ex;

public class TestSpring9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

         String[] why = email.split("@");
         String first = why[0];
         String second = why[1];
        System.out.println("ID: " + first);
        System.out.println("Domain: " + second);

    }
}
