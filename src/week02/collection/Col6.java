package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    // Map : key - value pair
    // key의 값으로 유니크하게 보장이 되어야 함
    // Map도 HashMap, TreeMap으로 응용!
    public static void main(String[] args) {
        Map<String, Integer> intMap = new HashMap<String, Integer>();

        //키 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14);
        intMap.put("삼", 15);

        //key값만 전체 출력
        for (String key : intMap.keySet()) {
            System.out.println(key);
        }

        //value값만 전체 출력
        for (Integer value : intMap.values()) {
            System.out.println(value); // key값고 value값이 다른 경우 맨 마지막에 들어온 value값을 최종 값으로 선언한다.
        }

        System.out.println(intMap.get("삼")); // 키를 가지고서 value를 가지고 옴

    }
}
