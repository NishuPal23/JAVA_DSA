package Recursion;

public class RemoveAllOccurrencesOfa {
    public static String remove(String str){
            if(str.length()==0){
                return "";
            }
            String ans = remove(str.substring(1));
            if(str.charAt(0)!='a'){
                ans=str.charAt(0)+ans;
            }
            return ans;
    }
    public static void main(String[] args) {
        String str = "abcax";
         String ans = remove(str);
        System.out.println(ans);
    }
}
