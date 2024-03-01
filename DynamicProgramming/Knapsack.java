package DynamicProgramming;

public class Knapsack {

    //Recursion
    //Time Complexity = O(2^n)
    //Space Complexity = O(n) call stack
    public static int solveRecur(int[]weight, int[]profit, int capacity, int idx){
        if(idx==0){
            if(weight[0]<=capacity){
                return profit[0];
            }
            else{
                return 0;
            }
        }
        int take = 0;
        if(weight[idx]<=capacity){
            take  = profit[idx]+solveRecur(weight,profit,capacity-weight[idx],idx-1);
        }
        int notTake = 0+solveRecur(weight,profit,capacity,idx-1);
        return Math.max(take,notTake);
    }



    //Memoization
    //Time Complexity = O(n)
    //Space Complexity = O(n+n^2) call stack and dp array
    public static int solveMemo(int[]weight, int[]profit, int capacity, int idx, int[][]dp){
        if(idx==0){
            if(weight[0]<=capacity){
                return profit[0];
            }
            else{
                return 0;
            }
        }
        if(dp[idx][capacity]!=-1)return dp[idx][capacity];
        int take = 0;
        if(weight[idx]<=capacity){
            take  = profit[idx]+solveMemo(weight,profit,capacity-weight[idx],idx-1,dp);
        }
        int notTake = 0+solveMemo(weight,profit,capacity,idx-1,dp);
        return dp[idx][capacity] = Math.max(take,notTake);
    }


    //Tabulation
    //Time Complexity = O(n*w)
    //Space Complexity = O(n^2) dp array
    public static int solveTab(int[]weight, int profit[], int capacity){
        int n = weight.length;
        int[][]dp = new int[n][capacity+1];
        for(int i = weight[0];i<=capacity;i++){
            if(weight[0]<=capacity){
                dp[0][i] = profit[0];
            }
            else{
                dp[0][i] = 0;
            }
        }
        for(int i =1 ;i<n;i++){
            for(int j =0;j<=capacity;j++){
                int take = 0;
                if(weight[i]<=j){
                     take  = profit[i]+dp[i-1][j-weight[i]];
                }
                int notTake = 0+dp[i-1][j];
                dp[i][j] = Math.max(take,notTake);
            }
        }
        return dp[n-1][capacity];
    }


    //Space Optimization
    //Time Complexity = O(n*w)
    //Space Complexity = O(n) curr array
    public static int spaceOpt(int[]weight, int[]profit, int capacity){
        int n = weight.length;
        int[] prev = new int[capacity+1];
        int[] curr = new int[capacity+1];
        for(int i =0;i<prev.length;i++){
            prev[i] =0;
            curr[i] =0;
        }
        for(int w = weight[0];w<=capacity;w++){
            if(weight[0]<=capacity){
                prev[w] = profit[0];
            }
            else{
                prev[w]=0;
            }
        }
        for(int i=1;i<n;i++){
            for(int j =capacity;j>=capacity;j--){
                int incl =0;
                if(weight[i]<=j){
                    incl = profit[i]+prev[j-weight[i]];
                }
                int excl = 0+prev[j];
                curr[j] = Math.max(incl,excl);
                
            }
            prev=curr;
        }
        return prev[capacity];

    }
    public static int maxProfit(int[]weight, int[]profit, int capacity){
        //Recursion
        int n = weight.length;
        //return solveRecur(weight,profit,capacity,n-1);

        //Memoization
        int[][]dp = new int[n+1][capacity+1];
        for(int i=0;i<=n;i++){
            for(int j =0;j<=capacity;j++){
                dp[i][j]=-1;
            }
        }
        //return solveMemo(weight,profit,capacity,n-1,dp);


        //Tabulation
        // return solveTab(weight,profit,capacity);


        //space optimization
        return spaceOpt(weight,profit,capacity);
    }
   public static void main(String[] args) {
    
    int weight[] = {4, 5, 1};
    int profit[] = {1, 2, 3};
    int capacity = 4;
    int ans = maxProfit(weight,profit,capacity);
    System.out.println(ans);
   } 
}
