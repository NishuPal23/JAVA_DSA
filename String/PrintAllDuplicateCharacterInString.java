package String;
import java.util.*;
public class PrintAllDuplicateCharacterInString {
    public static void print(String str){
        int n = str.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue()>1){
                System.out.println(m.getKey()+" : count "+m.getValue());
            }
        }

    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        print(str);
    }
}
