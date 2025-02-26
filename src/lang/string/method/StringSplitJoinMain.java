package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split() 자르기
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }

        String joinStr = "";
        for (String string : split) {
            joinStr += string + "-";
        }

        System.out.println("joinStr = " + joinStr);
        //join 합치기

        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println(joinedStr);
    }
    }

