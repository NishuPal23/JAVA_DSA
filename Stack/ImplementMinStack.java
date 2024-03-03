package Stack;
import java.util.*;
public class ImplementMinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();


    //push
    public void push(int val){
        if(st.size()==0 && min.size()==0){
            st.push(val);
            min.push(val);
        }
        else if(min.peek()<val){
             st.push(val);
             min.push(min.peek());
        }
        else {
            st.push(val);
            min.push(val);
        }
    }


    //pop
    public void pop(){
         st.pop();
         min.pop();
    }


    //top
    public int top(){
        return st.peek();
    }


    //getMin
    public int getMin(){
        return min.peek();
    }
    public static void main(String[] args) {
         ImplementMinStack ms = new ImplementMinStack();
         ms.push(7);
         ms.push(8);
         ms.push(5);
         ms.push(6);
         ms.push(3);
         ms.push(4);
         System.out.println("top element : "+ms.top());
         System.out.println("min element : "+ms.getMin());

         ms.pop();
         System.out.println("top element : "+ms.top());
         System.out.println("min element : "+ms.getMin());
         ms.pop();
         System.out.println("top element : "+ms.top());
         System.out.println("min element : "+ms.getMin());
    }
}
