package week02.collection;

import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        ArrayList<String> list1 = new ArrayList<>();
        Set<String> set1 = new HashSet<>();

        int num = 1;

        if (type.equals("list")) {
            System.out.println("레시피 항목을 입력하세요 (종료하려면 'exit' 입력):");
            while (true) {
                // 사용자에게 입력받을 메시지 출력 (선택사항)

                String input = scanner.nextLine();
                if (input.equals("exit")) {
                    break;  // "exit" 입력 시 반복문 종료
                }
                list1.add(num + ". " + input);
                num++;
            }
            for (int i = 0; i < list1.size(); i++) {
                String out = list1.get(i);
                System.out.println(out);
            }
            return;
        }




    }
    }

