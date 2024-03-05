package Queue;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElements {
    public static Queue<Integer> reverse(Queue<Integer> q, int k){
        Stack<Integer> st = new Stack<>();
        for(int i =1;i<=k;i++){
            st.push(q.remove());
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        int a = q.size()-k;
        for(int i =1;i<=a;i++){
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k =2;
        Queue<Integer> ans = reverse(q,k);
        System.out.println(ans);
    }
}
