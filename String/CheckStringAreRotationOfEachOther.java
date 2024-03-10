package String;

public class CheckStringAreRotationOfEachOther {
    public static boolean check(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        if(n!=m){
            return false;
        }
        String temp = str1+str1;
        if(temp.contains(str2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        boolean ans = check(str1,str2);
        System.out.println(ans);
    }
}
