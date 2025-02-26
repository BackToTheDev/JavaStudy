package lang.string.ex;

public class TestString15 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] result = email.split("@");
        String id = result[0];
        String domain = result[1];

        System.out.println("Id: " + id);
        System.out.println("Domain: " + domain);

    }
}
