package Stack;
import java.util.*;
public class MinimumBracketsRemoveToMakeBalance {
    public static int countRemove(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    st.push(ch);
                }
                else if(st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
       
        return st.size();

    }
    public static void main(String[] args) {
        String str = "(())())";
        int ans = countRemove(str);
        System.out.println(ans);
    }
}
