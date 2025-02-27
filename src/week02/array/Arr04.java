package week02.array;

import java.util.Arrays;

public class Arr04 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length);// a와는 주소가 다른 똑같은 배열을 만들어준다.
    }
}
