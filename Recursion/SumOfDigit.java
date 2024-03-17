package Recursion;

public class SumOfDigit {
    static int sum =0;
    public static int solve(int n){
        if(n<=0){
            return 0;
        }
        
        return n%10 + solve(n/10);
        
    }
    public static void main(String[] args) {
        int n = 123;
        int ans = solve(n);
        System.out.println(ans);
    }
}
