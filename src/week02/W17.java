package week02;

import java.util.Scanner;

public class W17 {

    public static void main(String[] args) {
        // 단 입력받는 단을 제외하고 출력
        Scanner scanner = new Scanner(System.in);

        System.out.print("제외시킬 단을 입력하세요 : ");
        int num = scanner.nextInt();


        for (int i = 2; i <= 9; i++) {
            if (i == num) {
                continue;
            }
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " : " + (i * j));
            }
        }
    }
}
