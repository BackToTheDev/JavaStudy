package week02.array;

public class Array03 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = a;

        a[0] = 3;

        System.out.println(b[0]);

    }
}
