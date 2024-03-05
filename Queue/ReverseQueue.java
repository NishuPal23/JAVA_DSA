package Queue;
import java.util.*;
public class ReverseQueue {
    public static Queue<Integer> reverse(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(q.size()!=0){
            st.push(q.remove());
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        Queue<Integer> ans = reverse(q);
        System.out.println(ans);
    }
}
