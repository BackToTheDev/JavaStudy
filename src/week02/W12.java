package week02;

public class W12 {

    public static void main(String[] args) {

        boolean flag = true;
        int number = 2;

        if (flag) {
            System.out.println("flag가 true입니다.");
            if (number == 1) {
                System.out.println("숫자는 1입니다. flag는 true");
            } else if (number == 2) {
                System.out.println("숫자는 2입니다. flag는 true");
            } else {
                System.out.println("숫자는 모르고 flag는 true");
            }
        }
    }
}
