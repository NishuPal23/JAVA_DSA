package DynamicProgramming;

public class RodCutting {

    //Recursion
    //Time Complexity = O(2^n)
    //Space Complexity = O(n) call stack
    public static int solveRecur(int n, int x, int y, int z){
        //Base case
        if(n==0){
            return 0;
        }
        if(n<0)return Integer.MIN_VALUE;
        int cutX = 1+solveRecur(n-x,x,y,z);
        int cutY = 1+solveRecur(n-y,x,y,z);
        int cutZ = 1+solveRecur(n-z,x,y,z);
        return Math.max(cutX,Math.max(cutY,cutZ));
    }


    //Memoization
    //Time Complexity = O(2^n)
    //Space Complexity = O(n+n) call stack and dp array
    public static int solveMemo(int n, int x, int y, int z, int[]dp){
        //Base case
        if(n==0){
            return 0;
        }
        if(n<0)return Integer.MIN_VALUE;
        if(dp[n]!=-1){
            return dp[n];
        }
        int cutX = 1+solveRecur(n-x,x,y,z);
        int cutY = 1+solveRecur(n-y,x,y,z);
        int cutZ = 1+solveRecur(n-z,x,y,z);
        return dp[n] = Math.max(cutX,Math.max(cutY,cutZ));
    }


    //Tabulation
    //Time Complexity = O(2^n)
    //Space Complexity = O(n) dp array
    public static int solveTab(int n, int x, int y, int z){
        int[]dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=Integer.MIN_VALUE;
        }
        dp[0] = 0;
        
        for(int i=1;i<=n;i++){
            if(i-x>=0){
                 dp[i] =Math.max(dp[i-x]+1,dp[i]);
            }
            if(i-y>=0){
                dp[i] =Math.max(dp[i-y]+1,dp[i]);
            }
            if(i-z>=0){
                dp[i] =Math.max(dp[i-z]+1,dp[i]);
            }
           
        }
        if(dp[n]<0)return 0;
        return dp[n];
    }

    public static int maxSegment(int n, int x, int y, int z){
        //Recursion
        //return solveRecur(n,x,y,z);

        //Memoization
        int[]dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        //return solveMemo(n,x,y,z,dp);


        //Tabulation
        return solveTab(n,x,y,z);
    }
    public static void main(String[] args) {
        int n = 7;
        int x = 5;
        int y = 2;
        int z = 2;
        int ans = maxSegment(n,x,y,z);
        System.out.println(ans);
    }
}
