package Searching;

public class SquareOfNumber {
    public static int findSqrt(int n){
        int low = 1;
        int  high = n;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid*mid==n){
                ans = mid;
                return ans;
            }
            else if(mid*mid<n){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 25;
        int ans = findSqrt(n);
        System.out.println(ans);
    }
}
