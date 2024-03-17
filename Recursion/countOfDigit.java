package Recursion;

public class countOfDigit {
    public static int countDigit(int n){
        if(n<=0){
            return 0;
        }
        return 1+countDigit(n/10);
    }
    public static void main(String[] args) {
        int n = 1234;
        int ans = countDigit(n);
        System.out.println(ans);
    }
    
}
