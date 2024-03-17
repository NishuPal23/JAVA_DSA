package Searching;

public class NthRootOfInteger {
    public static int pow(int mid, int n, int m){
        int ans = 1;
        while(n>0){
            if(n%2==1){
                ans = ans*mid;
                n = n-1;
            }
            else{
                mid = mid*mid;
                n=n/2;
            }
        }
        return ans;
    }
    public static int NthRoot(int n ,int m){
        int low = 1;
        int high = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            int ans = pow(mid,n,m);
            if(ans==n){
               return mid;
            }
            else if(ans<n){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 69;
        int m = 4;
        int ans = NthRoot(n,m);
        System.out.println(ans);
    }
}
