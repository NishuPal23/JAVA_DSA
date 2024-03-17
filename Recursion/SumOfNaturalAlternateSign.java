package Recursion;

public class SumOfNaturalAlternateSign {
    public static int solve(int n){
        if(n==1)return 1;
        if(n%2==0){
             return solve(n-1)-n;
        }
        else{
            return solve(n-1)+n;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = solve(n);
        System.out.println(ans);
    }
}
