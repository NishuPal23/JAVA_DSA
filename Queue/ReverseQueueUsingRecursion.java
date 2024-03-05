package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueUsingRecursion {

    //time Complexity = O(n)
    public static void reverse(Queue<Integer> q){
        if(q.size()==0){
             return;
        }
        int a = q.remove();
        reverse(q);
        q.add(a);

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
         reverse(q);
        System.out.println(q);
    }
}
