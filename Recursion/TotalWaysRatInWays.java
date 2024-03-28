package Recursion;

public class TotalWaysRatInWays {
    public static int totalWays(int tr, int tc, int r, int c){
        if(tr<r ||tc<c){
            return 0;
        }
        if(r==tr-1 &&c==tc-1){
            return 1;
        }
        int countRight = totalWays(tr,tc,r,c+1);
        int countDown = totalWays(tr,tc,r+1,c);
        return countRight +countDown;
    }
    public static void main(String[] args) {
        int tr = 3;
        int tc = 3;
        int ans = totalWays(tr,tc,0,0);
        System.out.println(ans);
    }
}
