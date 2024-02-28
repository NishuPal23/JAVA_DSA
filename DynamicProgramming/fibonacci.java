package DynamicProgramming;

public class fibonacci {
    //Recursion
    //Time Complexity = O(2^n)
    //Space Complexity = O(n) call stack
    public static int solveRecur(int n){
        //Base case
        if(n==0 || n==1){
            return n;
        }
        return solveRecur(n-1)+solveRecur(n-2);
    }


    //Memoization
    //Time Complexity = O(n)
    //Space Complexity = O(n+n) call stack+dp array
    public static int solveMemo(int n, int[]dp){
        //Base case
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1)return dp[n];
        return dp[n]= solveRecur(n-1)+solveRecur(n-2);
    }


    //Tabulation
    //Time Complexity = O(n)
    //Space Complexity = O(n) dp array
    public static int solveTab(int n){
         int[]dp = new int[n+1];
         dp[0]=0;
         dp[1] =1;
         for(int i=2;i<=n;i++){
            dp[i] =dp[i-1]+dp[i-2];
         }
         return dp[n];
    }


    //space optimization
    //Time Complexity = O(n)
    //Space Complexity = O(1) 
    public static int spaceOpt(int n){
        int prev2 = 0;
        int prev1 = 1;
        for(int i=2;i<=n;i++){
            int ans = prev1+prev2;
            prev2 = prev1;
            prev1 = ans;
        }
        return prev1;
    }


    public static int fib(int n){
        //recursion
        //return solveRecur(n);


        //Memoization
        int []dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        //return solveMemo(n,dp);


        //Tabulation
        //return solveTab(n);


        //space Optimization
        return spaceOpt(n);
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = fib(n);
        System.out.println(ans);
    }
}
