package week02.array;

public class Arr01 {

    public static void main(String[] args) {
        // 배열 생성
        int[] intArr = new int[3];
        boolean[] booArr = new boolean[3];
        String[] stringArr = new String[3];

        for (int i = 0; i < intArr.length; i++) {
            int num = intArr[i];
            System.out.println(num);
        }
    }
}
