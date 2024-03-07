package Stack;
import java.util.*;
public class MInimumCostToMakeStringValid {
    public static int cost(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        if(n%2!=0){
            return -1;
        }
        for(int i =0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='{'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()&& ch=='}'){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        int a =0;
        int b =0;
        while(!st.isEmpty()){
            if(st.peek()=='{'){
                a++;

            }
            else{
                b++;
            }
        }
        int ans = (a+1)/2+(b+1)/2;
        return ans;
    }
    public static void main(String[] args) {
        String str = "{{}{";
        int ans = cost(str);
        System.out.println(ans);
    }
}
