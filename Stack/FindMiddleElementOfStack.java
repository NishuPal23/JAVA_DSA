package Stack;
import java.util.*;
public class FindMiddleElementOfStack {
    public static void deleteMiddle(Stack<Integer> st, int count,int size){
        if(count==size/2){
            st.pop();
            return ;
        }
        int num = st.peek();
        st.pop();
        deleteMiddle(st,count+1,size);
        st.push(num);
        

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int n = st.size();
        deleteMiddle(st,0,n);
        System.out.println(st);
    }
}
