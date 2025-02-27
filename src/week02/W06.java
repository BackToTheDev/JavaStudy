package week02;

public class W06 {

    public static void main(String[] args) {
        // 대입연산자에서 주의해야 할 점!
        // ++, --

        int a = 10;
        int b = 10;
        int val = ++a + b--;
        // 전위연산자는 계산전에 증가시키고, 후위 연산자는 계산이 끝나고 나서 계산한다./
        System.out.println(a); // 11
        System.out.println(b); // 9
        System.out.println(val); // 21
    }
}
