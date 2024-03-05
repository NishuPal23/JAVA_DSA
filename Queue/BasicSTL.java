package Queue;
import java.util.*;
public class BasicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //add
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         System.out.println(q);


         //remove
         System.out.println(q.remove());

         //peek
         System.out.println(q.peek());
    }
}
