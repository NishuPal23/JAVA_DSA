package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoublyEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addLast(6);
        dq.addLast(7);
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
        System.out.println(dq.peek());

    }
}
