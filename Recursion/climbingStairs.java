package Recursion;

public class climbingStairs {
    public static int countWays(int n){
        if(n==1 ||n==2)return n;
        return countWays(n-1)+countWays(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        int ans = countWays(n);
        System.out.println(ans);
    }
}
