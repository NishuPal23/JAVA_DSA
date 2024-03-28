package Recursion;

public class CheckPallindrome {
    public static boolean isPallindrome(String str, int i , int j){
        if(i>=j){
            return true;
        }
        
        return str.charAt(i)==str.charAt(j) && isPallindrome(str,i+1,j-1)  ; 
    }
    public static void main(String[] args) {
        String str = "niiyn";
        int n = str.length();
        boolean ans = isPallindrome(str,0,n-1);
        System.out.println(ans);
    }
}
