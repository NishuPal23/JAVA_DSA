package DynamicProgramming;

public class LongestCommonSubsequence {

    //Recursion
    //Time Complexity = O(2^n)
    //Space Complexity = O(n) call stack
    public static int solveRecur(String str1, String str2, int i, int j){
        int n1 = str1.length();
        int n2 = str2.length();
        if(i>=n1 || j>=n2){
            return 0;
        }
        int ans =0;
        if(str1.charAt(i)==str2.charAt(j)){
            ans = 1+ solveRecur(str1,str2,i+1,j+1);
        }
        else{
            ans = Math.max(solveRecur(str1,str2,i,j+1),solveRecur(str1,str2,i+1,j));
        }
        return ans;
    }

    //Memoization
    //Time Complexity = O(n)
    //Space Complexity = O(n+n^2) call stack +dp
    public static int solveMemo(String str1, String str2, int i, int j, int[][]dp){
        int n1 = str1.length();
        int n2 = str2.length();
        if(i>=n1 || j>=n2){
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        int ans =0;
        if(str1.charAt(i)==str2.charAt(j)){
            ans = 1+ solveMemo(str1,str2,i+1,j+1,dp);
        }
        else{
            ans = Math.max(solveMemo(str1,str2,i,j+1,dp),solveMemo(str1,str2,i+1,j,dp));
        }
        return dp[i][j] = ans;
    }


    //Tabulation
    //Time Complexity = O(n^2)
    //Space Complexity = O(n^2) dp array
    public static int solveTab(String str1 , String str2){
         int n1 = str1.length();
         int n2 = str2.length();
         int[][] dp = new int[n1+1][n2+1];
         for(int i = n1-1;i>=0;i--){
             for(int j = n2-1;j>=0;j--){
                 int ans =0;
                 if(str1.charAt(i)==str2.charAt(j)){
                     ans = 1+ dp[i+1][j+1];
                 }
                else{
                     ans = Math.max(dp[i][j+1],dp[i+1][j]);
                }
                dp[i][j] = ans;
             }
        }
        return dp[0][0];
    }


//Space Optimization
//Time Complexity = O(n^2)
//Space Complexity = O(n2) curr array
public static int spaceOpt(String str1, String str2){
    int n1 = str1.length();
    int n2 = str2.length();
    int curr[] = new int[n2+1];
    int next[] = new int[n2+1];
    for(int i = n1-1;i>=0;i--){
        for(int j = n2-1;j>=0;j--){
            int ans =0;
            if(str1.charAt(i)==str2.charAt(j)){
                ans = 1+ next[j+1];
            }
            else{
                ans = Math.max(curr[j+1],next[j]);
            }
             curr[j] = ans;
        }
        next=curr;
    }
    return next[0];
}
    public static int LCS(String str1, String str2){
        //Recursion
        //return solveRecur(str1,str2,0,0);

        //memoization
        int n1 = str1.length();
        int n2 = str2.length();
        int[][] dp = new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                dp[i][j] = -1;
            }
        }
        //return solveMemo(str1,str2,0,0,dp);


        //Tabulation
        // return solveTab(str1,str2);

        //space optimization
        return spaceOpt(str1,str2);

    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int ans = LCS(str1,str2);
        System.out.println(ans);

    }
}
