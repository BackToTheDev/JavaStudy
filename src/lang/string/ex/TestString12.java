package lang.string.ex;

public class TestString12 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jap";
        String key = "hello";

        int count = 0;
        int find = str.indexOf(key);

        while(find >= 0) {
                find = str.indexOf(key, find + 1);
                count++;
            }
            System.out.println(count);

        }

    }
