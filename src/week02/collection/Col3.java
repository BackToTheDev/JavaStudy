package week02.collection;

import java.util.Stack;

public class Col3 {

    // Stack
    // 수직으로 값을 쌓아 놓고, 넣었다가 뺀다 FiLO(엘리베이터)  마지막에 들어온 것이 처음으로 나간다.
    // push, peek, pop
    // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1); //push 값을 넣는다.

        // 다 지워질 때 까지 출력
        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop()); // pop 맨마지막에 넣은 1이 가장 먼저 출력 그리고 출력된 값은 나간다.
        }

        // 다시 추가
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        //peak 조회
        System.out.println(intStack.peek()); // 맨마지막에 들어간 1이 출력된다.
        System.out.println(intStack.size()); //Stack의 사이즈를 알려줌

    }
}
