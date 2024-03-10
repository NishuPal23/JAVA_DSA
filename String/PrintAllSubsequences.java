package String;
import java.util.*;
public class PrintAllSubsequences {
    public static void printAll(String str, String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch = str.charAt(0);
        printAll(str.substring(1),ans+ch);
        printAll(str.substring(1),ans);
    }

    public static ArrayList<String> store(String str, String ans, ArrayList<String> arr){
        if(str.length()==0){
            arr.add(ans);
            return arr;
        }
        char ch = str.charAt(0);
        store(str.substring(1),ans+ch,arr);
        store(str.substring(1),ans,arr);
        return arr;
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        printAll(str,ans);
        System.out.println();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> ans2 = store(str,ans,arr);
        System.out.println(ans2);
    }
}
;