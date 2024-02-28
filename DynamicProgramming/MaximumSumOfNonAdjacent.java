package DynamicProgramming;

public class MaximumSumOfNonAdjacent {

    //Recursion
    //Time Complexity = O(2^n)
    //Space Complexity = O(n) call stack
    public static int solveRecur(int[]arr,int n){
        //Base case
        if(n==0){
            return arr[0];
        }
        if(n<0)return 0;
        int incl = arr[n]+solveRecur(arr,n-2);
        int excl = solveRecur(arr,n-1);
        return Math.max(incl,excl);

    }


    //Memoization
    //Time Complexity = O(n)
    //Space Complexity = O(n+n) call stack+dp array
    public static int solveMemo(int[]arr, int n, int[]dp){
        //Base case
        if(n==0){
            return arr[0];
        }
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int incl = arr[n]+solveRecur(arr,n-2);
        int excl = solveRecur(arr,n-1);
        return dp[n] = Math.max(incl,excl);

    }


    //Tabulation
    //Time Complexity = O(n)
    //Space Complexity = O(n) dp array
    public static int solveTab(int arr[]){
        int n = arr.length;
        int[][]dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = arr[0];
        for(int i=1;i<n;i++){
            dp[i][1] = arr[i]+dp[i-1][0];
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
        }
        return Math.max(dp[n-1][0],dp[n-2][1]);
        
    }


    //space optimization
    //Time Complexity = O(n)
    //Space Complexity = O(1) 
    public static int spaceOpt(int[]arr){
        int n = arr.length;
        int prev2 = 0;
        int prev1 = arr[0];
        for(int i=1;i<n;i++){
            int incl = arr[i]+prev2;
            int excl = prev1;
            int ans = Math.max(incl,excl);
            prev2 = prev1;
            prev1 = ans;
        }
        return prev1;
    }

    public static int maxSum(int[]arr){
        int n = arr.length;
        //Recursion
        //return solveRecur(arr,n-1);

        //Memoization
        int[]dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        //return solveMemo(arr,n-1,dp);

        //Tabulation
        return solveTab(arr);
    }
    public static void main(String[] args) {
        int arr[] ={9,9,8,2};
        int ans = maxSum(arr);
        System.out.println(ans);
    }
}
