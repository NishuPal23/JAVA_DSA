package DynamicProgramming;

public class LongestIncreasingSubsequence {

    //Recursion
    //Time Complexity = O(2^n)
    //Space Complexity = O(n) call stack
    public static int solveRecur(int[]arr,int curr, int prev){
        int n = arr.length;
        if(curr==n){
            return 0;
        }
        int take = 0;
        
        if(prev==-1 ||arr[curr]>arr[prev]){
             take = 1 + solveRecur(arr,curr+1,curr);
        }
        int notTake = 0 + solveRecur(arr,curr+1,prev);
        return Math.max(take,notTake);
    }


    //Memoization
    //Time Complexity = O(n)
    //Space Complexity = O(n+n^2) call stack and dp array
    public static int solveMemo(int[]arr,int curr, int prev, int[][]dp){
        int n = arr.length;
        if(curr==n){
            return 0;
        }
        if(dp[curr][prev+1]!=-1)return dp[curr][prev+1];
        int take = 0;
        
        if(prev==-1 ||arr[curr]>arr[prev]){
             take = 1 + solveMemo(arr,curr+1,curr,dp);
        }
        int notTake = 0 + solveMemo(arr,curr+1,prev,dp);
        return dp[curr][prev+1] = Math.max(take,notTake);
    }


    //Tabulation
    //Time Complexity = O(n^2)
    //Space Complexity = O(n^2) dp array
    public static int solveTab(int[]arr){
        int n = arr.length;
        int[][]dp = new int[n+1][n+1];
        for(int curr = n-1;curr>=0;curr--){
            for(int prev = curr-1;prev>=-1;prev--){
                int take = 0;
        
                if(prev==-1 ||arr[curr]>arr[prev]){
                     take = 1 + dp[curr+1][curr+1];
                }
                int notTake = 0 + dp[curr+1][prev+1];
                 dp[curr][prev+1] = Math.max(take,notTake);
            }
        }
        return dp[0][0];
    }


    //Space optimization
    //Time Complexity = O(n^2)
    //Space Complexity = O(n) currRow
    public static int spaceOpt(int[]arr){
        int n = arr.length;
        int currRow[] = new int[n+1];
        int nextRow[] = new int[n+1];
        for(int curr = n-1;curr>=0;curr--){
            for(int prev = curr-1;prev>=-1;prev--){
                int take = 0;
        
                if(prev==-1 ||arr[curr]>arr[prev]){
                     take = 1 + nextRow[curr+1];
                }
                int notTake = 0 + nextRow[prev+1];
                 currRow[prev+1] = Math.max(take,notTake);
            }
            nextRow = currRow;
        }
        return nextRow[0];
    }
    public static int LIS(int[]arr){
        int n = arr.length;
        //Recursion
        //return solveRecur(arr,0,-1);


        //Memoization
        int [][]dp = new int[n][n+1];
        for(int i=0;i<n;i++){
            for(int j =0;j<=n;j++){
                dp[i][j] = -1;
            }
        }       
        //return solveMemo(arr,0,-1,dp);


        //Tabulation
        //return solveTab(arr);


        //space Optimization
        return spaceOpt(arr);
    }
    public static void main(String[] args) {
        int arr[] = {10,9,2,5,3,7,101,18};
        int ans = LIS(arr);
        System.out.println(ans);
    }
}
