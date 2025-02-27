package week02.array;

public class Arr08 {

    public static void main(String[] args) {
        //최댓값 구하기
        int[] arr = {3, 2, 1, 5, 1};

        //최댓값 구하기 세팅
        int max = arr[0];
        int min = arr[0];

        // 최댓값 구하기 로직
        for (int num : arr) {
            if(max <= num) {
                max = num;
            }
        }
        System.out.println(max);


        for (int num : arr) {
            if(min > num) {
                min = num;
            }
        }
        System.out.println(min);
    }
    }
