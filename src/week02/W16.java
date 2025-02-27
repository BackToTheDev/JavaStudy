package week02;

public class W16 {

    public static void main(String[] args) {
//        int number = 0;
//
//        //~하는 동안
//        while (number < 3) {
//            number++;
//            System.out.println(number + "출력");
//        }

        // do ~ while
//        int number = 4;
//        do {
//            // 이 로직을 먼저 수행하겠다.
//            System.out.println(number + "출력!");
//        } while (number < 3);
        //반복문 실행하기 전 반복문이 작동하지 않더라도 무조건 수행시켜야 하는 코드가
        // 있다면 do{}안에 포함시켜주면 된다.


//        for (int i = 0; i < 10; i++) {
//            System.out.println("i = " + i);
//            if (i == 2) {
//                break;
//            }
//            for (int j = 0; j < 10; j++) {
//                System.out.println("j = " + j);
//                if (j == 2) {
//                    break; //break시 가장 가까운곳의 반복문 or 조건문 등을 종료한다.
//                    // 모든 반복문이 종료되는게 아님 지금 중첩반복문의 내부 반복문만 종료됨
//                }
//            }
//        }

        int number = 0;
        while (number < 3) {
            number++;
            if (number == 2) {
                continue;
            }
            System.out.println(number + "출력!");
        }
    }
}
