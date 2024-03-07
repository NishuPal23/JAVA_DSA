package Stack;
import java.util.*;
public class RedundantBrackets {
    public static boolean redundant(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for(int i =0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='(' ||ch=='+'||ch=='-'||ch=='/'||ch=='*'){
                st.push(ch);
            }
            else{
                if(ch==')'){
                    boolean redun = true;
                    while(st.peek()!='('){
                        char top = st.peek();
                        if(top=='+'||top=='-'||top=='*'||top=='/'){
                            redun = false;
                        }
                        st.pop();
                    }
                    if(redun==true){
                        return true;
                    }
                    st.pop();

                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        boolean ans = redundant(str);
        System.out.println(ans);
    }
}
