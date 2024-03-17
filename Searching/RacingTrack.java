package Searching;

public class RacingTrack {
    public static boolean isPossible(int[]arr,int n, int mid, int m){
        int kidsPlaced = 1;
        int lastKid = arr[0];
        for(int i =1;i<n;i++){
            if(arr[i]-lastKid>=mid){
                kidsPlaced++;
                lastKid = arr[i];
            }

        }
        return (kidsPlaced>=m);
    }
    public static int maximalMinima(int[]arr,int m){
        int n = arr.length;
        int start = 0;
        int end = (int)1e9;
        int ans = 0;
        while(start<end){
            int mid = (end+(end-start))/2;
            if(isPossible(arr,n,mid,m)){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,4,8,9};
        int m = 3;
        int ans = maximalMinima(arr,m);
        System.out.println(ans);
    }
}
