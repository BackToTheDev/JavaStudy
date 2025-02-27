package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    // Set
    // 집합 : 순서 없고, 중복 없음!
    // 순서가 보장되지 않는 대신, 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
    // Set -> 그냥 쓸 수도 있음, 그러나, HashSet, TreeSet 등으로 응용해서 같이 사용 가능
    // Set은 생성자가 없는 껍데기라서 바로 생성할 수 없음!
    // 생성자가 존재하는 HashSet을 이용해서 -> Set을 구현해 볼 수 있음

    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<Integer>();// Set은 생성자가 없어서 Hashset을 이용해서 생성함

        intSet.add(1); // 이렇게 값을 넣어서 출력하면 1, 12, 5, 9가 나오지 않고
        intSet.add(12); // 1, 5, 9, 12가 출력됨 순서없고 중복없고 자동으로 집합을 시켜줌
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value : intSet) {
            System.out.println(value);
        }

        //contains 포함하고 있는지 물어보는거
        System.out.println(intSet.contains(2)); // 2를 포함하고 있어?
        System.out.println(intSet.contains(5));// 5를 포함하고 있어?
    }
}
