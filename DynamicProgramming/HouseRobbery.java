package DynamicProgramming;

public class HouseRobbery {

    //Recursion
    //Time Complexity = O(2^n)
    //Space Complexity = O(n) call stack
    public static int solveRecur(int[]arr, int n){
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
    //Space Complexity = O(n+n) call stack and dp array
    public static int solveMemo(int[]arr, int n, int dp[]){
        if(n==0){
            return arr[0];
        }
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int incl = arr[n]+solveMemo(arr,n-2,dp);
        int excl = solveMemo(arr,n-1,dp);
        return dp[n] = Math.max(incl,excl);
    }


    //Tabulation
    //Time Complexity = O(n)
    //Space Complexity = O(n) dp array
    public static int solveTab(int[]arr){
        int n = arr.length;
        int[][]dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = arr[0];
        for(int i=1;i<n;i++){
            dp[i][1] = arr[i]+dp[i-1][0];
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
        }
        return Math.max(dp[n-1][0],dp[n-1][1]);
    }


    //Space optimization
    //Time Complexity = O(n)
    //Space Complexity = O(1) 
    public static int spaceOpt(int[]arr){
        int n = arr.length;
        int prev2 = 0;
        int prev1 = arr[0];
        for(int i=1;i<n;i++){
            int incl = arr[i]+prev2;
            int excl = prev2;
            int ans = Math.max(incl,excl);
            prev2 = prev1;
            prev1 = ans;
        }
        return prev1;
    }
    public static int rob(int[]arr){
        int n = arr.length;
        if(n==0)return 0;
        if(n==1)return arr[0];
        int first[] = new int[n-1];
        int second[] = new int[n-1];
        int idx1 =0;
        int idx2 =0;
        
        for(int i =0;i<n;i++){
           if(i!=0){
            second[idx2] = arr[i];
            idx2++;
           }
           if(i!=n-1){
            first[idx1] = arr[i];
            idx1++;
           }
        }
        int f = first.length;
        
        //Recursion
        //return Math.max(solveRecur(first,f-1),solveRecur(second,f-1));


        //Memoization
        int[]dp = new int[f+1];
        for(int i=0;i<=f;i++){
            dp[i]=-1;
        }
        int a = solveMemo(first,f-1,dp);
        for(int i=0;i<=f;i++){
            dp[i]=-1;
        }
        int b = solveMemo(second,f-1,dp);
        //return Math.max(a,b);


        //Tabulation
        //return Math.max(solveTab(first),solveTab(second));

        //Space optimization
        return Math.max(spaceOpt(first),spaceOpt(second));

        
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3};
       int ans = rob(arr);
       System.out.println(ans);
    }
}
