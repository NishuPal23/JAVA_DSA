package Backtracking;
import java.util.*;
public class FindKthPermutation {
    public static char[] swap(String str, int i, int j){
        char[]ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        // str = ch.toString();
        return ch;
    }
    public static void generatePermutation(String str,ArrayList<String> result,int idx){
        if(idx==str.length()-1){
            result.add(str);
            return;
        }
        for(int i = idx;i<str.length();i++){
            str=new String(swap(str,i,idx));
            generatePermutation(str,result,idx+1);
            str = new String(swap(str,i,idx));
        }
    }
    public static String findKthPermutation(int n, int k){
        String str = "";
        for(int i =1;i<=n;i++){
            str+=i;
        }
        ArrayList<String> result = new ArrayList<>();
        generatePermutation(str,result,0);
        Collections.sort(result);
        return result.get(k-1);
    }
    public static void main(String[] args) {
        int n = 3;
        int k = 4;
        String ans = findKthPermutation(n,k);
        System.out.println(ans);
    }
}
