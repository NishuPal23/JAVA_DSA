package Queue;
import java.util.*;
public class FirstNonRepeatingCharacterInStream {
    public static String nonRepeat(String str){
        int n = str.length();
        HashMap<Character,Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        String ans = "";
        for(int i =0;i<n;i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            q.add(ch);
            while(q.size()!=0){
                if(map.get(q.peek())>1){
                    q.remove();
                }
                else{
                    ans+=q.peek(); 
                    
                    break;
                }
            }
            if(q.size()==0){
                ans+="#";
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aabc";
        String ans = nonRepeat(str);
        System.out.println(ans);
    }
}
