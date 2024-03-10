package String;
import java.util.*;
public class ValidShuffle {
    public static String sortString(String str1){
        char arr1[] = str1.toCharArray();
        Arrays.sort(arr1);
        str1 = String.valueOf(arr1);
        return str1;
    }
    public static boolean validShuffle(String str1, String str2, String shuffle){
        int n = str1.length();
        int m = str2.length();
        int l = shuffle.length();
        if(n+m!=l){
            return false;
        }
        int i =0;
        int j =0;
        int k = 0;
        str1 = sortString(str1);
        str2 = sortString(str2);
        shuffle = sortString(shuffle);

        while(k!=l){
            if(str1.charAt(i)==shuffle.charAt(k)){
                i++;
                k++;
            }
            else if(str2.charAt(j)==shuffle.charAt(k)){
                j++;
                k++;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "xy";
        String str2 = "12";
        String shuffle = "1xy2";
        boolean ans = validShuffle(str1,str2,shuffle);
        System.out.println(ans);
    }
}
