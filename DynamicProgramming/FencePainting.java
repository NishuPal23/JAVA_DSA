package DynamicProgramming;
/*Given a fence with n posts and k colors, find out the number of ways of painting the fence so that not more than two consecutive posts have the same colors. Since the answer can be large return it modulo 109 + 7. */

public class FencePainting {

    //Recursion
    //Time Complexity = O(2^n)
    //Space Complexity = O(n) call stack
    public static int solveRecur(int post, int color){
        //Base case
        if(post==1)return color;
        if(post == 2){
            return color+(color*(color-1));
        }
        int lastTwoSame = solveRecur(post-2,color)*(color-1);
        int lastTwoDiff = solveRecur(post-1,color)*(color-1);
        return lastTwoSame+lastTwoDiff;
    }


    //memoization
    //Time Complexity = O(n)
    //Space Complexity = O(n+n) call stack and dp array
    public static int solveMemo(int post, int color, int[]dp){
        //Base case
        if(post==1)return color;
        if(post == 2){
            return color+(color*(color-1));
        }
        if(dp[post]!=-1)return dp[post];
        int lastTwoSame = solveMemo(post-2,color,dp)*(color-1);
        int lastTwoDiff = solveMemo(post-1,color,dp)*(color-1);
        return dp[post] = lastTwoSame+lastTwoDiff;
    }


    //Tabulation
    //Time Complexity = O(n)
    //Space Complexity = O(n) dp array
    public static int solveTab(int post, int color){
        if(post==1)return color;
        int[]dp = new int[post+1];
        dp[1] = color;
        dp[2] = color+(color*(color-1));
        for(int i=3;i<=post;i++){
            dp[i] = dp[i-2]*(color-1) + dp[i-1]*(color-1);
        }
        return dp[post];
    }


    //Space Optimization
    //Time Complexity = O(n)
    //Space Complexity = O(1) 
    public static int spaceOpt(int post, int color){
        if(post ==1)return color;
        int prev2 = color;
        int prev1 = color+(color*(color-1));
        for(int i=3;i<=post;i++){
            int ans = prev2*(color-1) + prev1*(color-1);
            prev2 = prev1;
            prev1 = ans;
        }
        return prev1;
    }
    public static int fencePaint(int post, int color){
           //recursion
           //return solveRecur(post, color);


           //Memoization
           int[]dp = new int[post+1];
           for(int i=0;i<=post;i++){
               dp[i] =-1;
           }
           //return solveMemo(post,color,dp);


           //Tabulation
           //return solveTab(post,color);

           //spaceOptimization
           return spaceOpt(post,color);
    }
    public static void main(String[] args) {
        int post = 4;
        int color = 3;
        int ans = fencePaint(post,color);
        System.out.println(ans);
    }
}
