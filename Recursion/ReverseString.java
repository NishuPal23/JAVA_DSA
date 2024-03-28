package Recursion;

public class ReverseString {
    public static String reverse(String str){
        if(str.length()==0){
            return "";
        }
        String ans = reverse(str.substring(1));
         ans+=str.charAt(0);
         return ans;
    }
    public static void main(String[] args) {
        String str = "Nishu";
        String ans = reverse(str);
        System.out.println(ans);
    }
    
}
