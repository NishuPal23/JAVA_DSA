package String;
import java.util.*;
public class WordBreakProblem {
    public static boolean solveRecur(String str, ArrayList<String> arr){
        if(str.length()==0){
            return true;
        }
        for(int i =1;i<=str.length();i++){
            String prefix = str.substring(0,i);
            if(arr.contains(prefix) && solveRecur(str.substring(i),arr)){
                return true;
            }
        }
        return false;
    }

    public static boolean solveMemo(String str, ArrayList<String> arr,Set<String>memo){
        if(memo.contains(str)){
            return false;
        }
        if(str.length()==0){
            return true;
        }
        for(String word : arr){
            if(str.startsWith(word) && solveMemo(str.substring(word.length()),arr,memo)){
                return true;
            }
        }
        memo.add(str);
        return false;
   }

   public static boolean solveTab(String str, ArrayList<String> arr){
        int n = str.length();
        boolean[]dp = new boolean[n+1];
        dp[0] = true;
        for(int i =1;i<=n;i++){
            for(int j = 0;j<i;j++){
                if(dp[j] && arr.contains(str.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
         }
         return dp[n];
   }
    public static boolean wordBreak(String str, ArrayList<String>arr){
        //return solveRecur(str,arr);

        //memoization
        //return solveMemo(str,arr,new HashSet<>());

        //Tabulation
        return solveTab(str,arr);
    }
   public static void main(String[] args) {
    String str = "leetcode";
    ArrayList<String> arr = new ArrayList<>();
    arr.add("leet");
    arr.add("code");
    arr.add("is");
    arr.add("best");

    boolean ans = wordBreak(str,arr);
    System.out.println(ans);
   } 
}
