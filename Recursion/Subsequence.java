package Recursion;

public class Subsequence {
    public static void subsequence(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        subsequence(str.substring(1),ans+str.charAt(0));
        subsequence(str.substring(1),ans);
    }
    public static void main(String[] args) {
        String str = "abb";
        String ans = "";
        subsequence(str,ans);
    }
}
