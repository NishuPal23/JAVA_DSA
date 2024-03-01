package DynamicProgramming;

public class coinChange {
    //Recursion 
    public static int solveRecur(int[]arr, int target){
        if(target==0)return 0;
        if(target<0)return Integer.MAX_VALUE;
        int ans =0;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            ans = solveRecur(arr,target-arr[i]);
            if(ans!=Integer.MAX_VALUE){
                max = Math.min(ans+1,max);
            }
        }
        return max;
    }


    //Memoization
    public static int solveMemo(int[]arr, int target, int[]dp){
        if(target==0)return 0;
        if(target<0)return Integer.MAX_VALUE;
        if(dp[target]!=-1)return dp[target];
        int ans =0;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            ans = solveMemo(arr,target-arr[i],dp);
            if(ans!=Integer.MAX_VALUE){
                max = Math.min(ans+1,max);
            }
        }
        return dp[target] = max;
    }


    //Tabulation
    public static int solveTab(int[]arr, int target){
        int[]dp = new int[target+1];
        for(int i =0;i<=target;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] =0;
        for(int i =1;i<=target;i++){
            for(int j = 0 ;j<arr.length;j++){
               if(i-arr[j]>=0 && dp[i-arr[j]]!=Integer.MAX_VALUE){
                dp[i] = Math.min(dp[i-arr[j]]+1,dp[i]);
               }
                
            }
        }
        return dp[target] ;
        
    }

    public static int minCoins(int[]arr, int target){
        //Recursion
        // int ans =  solveRecur(arr,target);
        // if(ans==Integer.MAX_VALUE){
        //     return -1;
        // }
        // else{
        //     return ans;
        // }


        //Memoization
        //int n = arr.length;
        // int[]dp = new int[target+1];
        // for(int i=0;i<=target;i++){
        //     dp[i]=-1;
        // }
        // int ans =  solveMemo(arr,target,dp);
        // if(ans==Integer.MAX_VALUE){
        //     return -1;
        // }
        // else{
        //     return ans;
        // }


        //Tabulation
        int ans =  solveTab(arr,target);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return ans;
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,5};
        int target = 11;
        int ans = minCoins(arr,target);
        System.out.println(ans);
    }
}
