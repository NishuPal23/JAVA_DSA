package String;

public class LongestPallindromicSubstring {
    public static boolean isPallin(String str){
        int i =0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                 return false;
                 
            }
            i++;
            j--;
        }
        return true;
    }
    public static String solve1(String str){
        int max = Integer.MIN_VALUE;
        String ans = "";
        for(int i =0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String pallin = str.substring(i,j);
                if(isPallin(pallin)){
                    int l = pallin.length();
                    if(l>max){
                        max = l;
                       ans = pallin;
                    }
                }
            }
        }
        return ans;
    }

    public static int expandAroundCenter(String str, int i, int j){
        while((i>=0 && j<str.length() )&& str.charAt(i)==str.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }

    public static String solve2(String str){
        int n = str.length();
        int start =0;
        int end =0;
        for(int i =0;i<n;i++){
            int len1 = expandAroundCenter(str,i,i);
            int len2 = expandAroundCenter(str,i,i+1);
            int len = Math.max(len1,len2);
            
            if(len>end-start){
                start = i-(len-1)/2;
                end = i+len/2;
                
            }
        } 
        return str.substring(start,end+1);
    }
    public static void main(String[] args) {
        String str = "rfkqyuqfjkxy";
        String ans = solve1(str);
        System.out.println(ans);
        String ans2 = solve2(str);
        System.out.println(ans2);
    }
}
