package Recursion;

import java.util.*;

public class LetterCombination {
    public static void combination(String str, String[]kp, ArrayList<String> arr, String ans){
        if(str.length()==0){
            arr.add(ans);
            return;
        }
        int index = str.charAt(0)-'0';
        String s = kp[index];
        for(int i =0;i<s.length();i++){
            combination(str.substring(1),kp,arr,ans+s.charAt(i));
        }

    }
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        String str = "23";
         String kp[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
         combination(str,kp,ans,"");
         System.out.println(ans);
    }
}
