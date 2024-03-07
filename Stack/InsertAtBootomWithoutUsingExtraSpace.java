package Stack;
import java.util.*;
public class InsertAtBootomWithoutUsingExtraSpace {

    public static void insertBottom(Stack<Integer> st,int data){
        //Base case
        if(st.size()==0){
            st.push(data);
            return;
        }
        int num = st.pop();
        insertBottom(st,data);
        st.push(num);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int data = 1;
        insertBottom( st,data);
        System.out.println(st);
    }
}
