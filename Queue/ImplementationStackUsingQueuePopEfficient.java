package Queue;
import java.util.*;
public class ImplementationStackUsingQueuePopEfficient {
    Queue<Integer> q =  new LinkedList<>();
    //push
    public void push(int val){
        if(q.size()==0){
            q.add(val);
        }
        else{
        q.add(val);
        for(int i=1;i<q.size();i++){
            q.add(q.remove());
        }
    }
    }

    //pop
    public int pop(){
        return q.remove();
    }

    //peek
    public int peek(){
        return q.peek();
    }
    public static void main(String[] args) {
        ImplementationStackUsingQueuePopEfficient im = new ImplementationStackUsingQueuePopEfficient();
        im.push(1);
        im.push(2);
        im.push(3);
        im.push(4);
        System.out.println(im.q);
        System.out.println("pop element : "+im.pop());
        System.out.println("peek element " +im.peek());
        System.out.println("pop element : "+im.pop());
        System.out.println("peek element " +im.peek());
    }
}
