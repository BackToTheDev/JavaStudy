package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {

    //Queue : FIFO 먼저 들어간 애가 먼저 나간다.
    // add(추가), peek(조회), poll(값을 꺼내버리는거)
    // Queue : 생성자가 없는 인터페이스

    public static void main(String[] args) {
        Queue<Integer> intQueue = new LinkedList<Integer>(); // Queue는 생성자가 없기 떄문에 new Queue가 불가능 떄문에 new LinkedList를 붙여준다.

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());
        }

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);
        intQueue.add(15);

        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());



    }
}
