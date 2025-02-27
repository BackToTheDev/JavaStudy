package week02.collection;

import java.util.ArrayList;

public class Col1 {

    public static void main(String[] args) {
        // List
        //순서가 있는 데이터의 집합 -> Array(길이를 알아야 한다.)
        // 처음에 길이를 몰라도 만들 수 있다.
        //Array 정적 배열
        //List(ArrayList) -?> 동적 배열(크기가 가변적으로 늘어난다)
        //  - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
        //  - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하니깐 상관없다.

        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 + 생성

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        System.out.println(intList.get(1));

        // 2번째 있는 값을 바꿔보자.
        intList.set(1, 35);
        System.out.println(intList.get(1));

        //삭제
        intList.remove(0);
        System.out.println(intList.get(0));

        System.out.println("클리어 전");
        System.out.println(intList.toString()); //List에 있는 값을 보여주는 코드

        intList.clear(); // List의 모든 값을 삭제
        System.out.println("클리어 후");
        System.out.println(intList.toString());

    }
}
