package Queue;
import java.util.*;
public class ImplementStackusingQueuePushEfficient {
    Queue<Integer> q = new LinkedList<>();


    //push
    public void push(int val){
        q.add(val);
    }

    //pop
    public int pop(){
         for(int i=1;i<q.size();i++){
            q.add(q.remove());
         }
         int ans =  q.remove();
         return ans;
    }

    //peek()
    public int peek(){
        for(int i=1;i<q.size();i++){
            q.add(q.remove());
         }
         int ans =  q.peek();
         q.add(q.remove());
         return ans;
         
         
    }

    
    public static void main(String[] args) {
        ImplementStackusingQueuePushEfficient im = new ImplementStackusingQueuePushEfficient();
        im.push(1);
        im.push(2);
        im.push(3);
        im.push(4);
        System.out.println(im.q);
        System.out.println("pop element : "+im.pop());
        System.out.println("peek element " +im.peek());
        System.out.println("pop element : "+im.pop());
        System.out.println("peek element " +im.peek());
        System.out.println(im.q);

    }
}
