package Stack;
import java.util.*;
public class BasicSTL {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        //push  last in first out
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);


        //pop
        System.out.println(st.pop());


        //size
        System.out.println(st.size());


        //isEmpty
        System.out.println(st.isEmpty());


    }
}
