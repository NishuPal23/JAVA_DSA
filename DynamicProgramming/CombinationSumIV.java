package DynamicProgramming;
/*Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target. */


public class CombinationSumIV {
    //Recursion
    //Time Complexity = O(2^n)
    //Space Complexity = O(n) call stack
    public static int solveRecur(int []arr, int target){
          if(target==0)return 1;
          if(target<0)return 0;
          int ans = 0;
          for(int i=0;i<arr.length;i++){
            ans += solveRecur(arr,target-arr[i]);
          }
          return ans;
    }


    //Memoization
    //Time Complexity = O(n)
    //Space Complexity = O(n+n) call stack and dp array
    public static int solveMemo(int []arr, int target, int[]dp){
        if(target==0)return 1;
        if(target<0)return 0;
        if(dp[target]!=-1)return dp[target];
        int ans = 0;
        for(int i=0;i<arr.length;i++){
          ans += solveRecur(arr,target-arr[i]);
        }
        return dp[target] = ans;
    }

    //Tabulation
    //Time Complexity = O(n^2)
    //Space Complexity = O(n) dp array
    public static int solveTab(int[]arr, int target){
        int[]dp = new int[target+1];
        dp[0] =1;
        for(int i=1;i<=target;i++){
            for(int j =0;j<arr.length;j++){
                if(i-arr[j]>=0){
                    dp[i] += dp[i-arr[j]];
                }
            }
        }
        return dp[target];
    }
   

    public static int combinationSum(int[]arr, int target){
        //recursion
       // return solveRecur(arr,target);


       //Memoization
       int[]dp = new int[target+1];
       for(int i=0;i<=target;i++){
        dp[i]=-1;
       }
       //return solveMemo(arr,target,dp);


       //Tabulation
       return solveTab(arr,target);
    }


    
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int target = 4;
        int ans = combinationSum(arr,target);
        System.out.println(ans);
    }
}
