package week02.array;

import java.util.Arrays;

public class Arr02 {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

//        for (int i = 0; i < intArr.length; i++) {
//            int num = intArr[i];
//            System.out.println(num);
//        }

//        for (int num : intArr) {
//            System.out.println(num);
//        }

        Arrays.fill(intArr, 1);
        for (int item : intArr) {
            System.out.println(item);
        }
    }
}
