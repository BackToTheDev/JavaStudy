package week02.array;

public class Arr05 {

    public static void main(String[] args) {
        //String 기능 활용 예시
        String str = "ABCD";

        // (1) length 인덱스로 몇글자 쓰는지 int로 알려줌
        int strLength = str.length();
        System.out.println(strLength);

        //(2) charAt char로 내가 원하는 순서의 글자를 뽑아줌
        char strChar = str.charAt(1);
        System.out.println(strChar);

        //(3) subString(int fromIndex, int toIndex) 어디부터 어디까지 잘라줄까?
        String strSub = str.substring(1, 3);
        System.out.println(strSub);

        // (4) equals(String str) 동등성 내용이 정말 같아?
        String newStr = "ABCD";
        boolean strEquals = newStr.equals(str);
        System.out.println(strEquals);

        // (5) toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();

        // (6) char[] -> String -> char
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);

    }
}
