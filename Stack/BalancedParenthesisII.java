package Stack;
import java.util.*;
public class BalancedParenthesisII {

    public static boolean checkBalance(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else if(ch =='{'){
                st.push(ch);
            }
            else if(ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='(' && ch==')'){
                    st.pop();
                }
                else if(st.peek()=='[' && ch==']'){
                    st.pop();
                }
                else if(st.peek()=='{' && ch=='}'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.size()==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "{}{(}))}";
        boolean ans = checkBalance(str);
        System.out.println(ans);
    }
}
