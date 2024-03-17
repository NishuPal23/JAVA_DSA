package Searching;

public class MinimumDaysToMakeMBouquets {
    public static boolean isPossible(int[]arr,int m , int pair, int n, int mid){
        int count =0;
        int noOfBouquet = 0;
        for(int i =0;i<n;i++){
            if(arr[i]<=mid){
                count++;
            }
            else{
                noOfBouquet += count/pair;
                count =0;
            }
        }
        noOfBouquet += count/pair;
        if(noOfBouquet<m){
            return false;
        }
        return true;
    }
    public static int makeBouquet(int[]arr,int m, int pair){
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
           end = Math.max(arr[i],end);
           start = Math.min(arr[i],start);
        }
           int ans =0;
           while(start<end){
            int mid = start+(end-start)/2;
            if(isPossible(arr,m,pair,n,mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;  
        
    }
    public static void main(String[] args) {
        int[]arr = {7,7,7,7,13,11,12,7};
        int m = 2;
        int pair = 3;
        int ans = makeBouquet(arr,m,pair);
        System.out.println(ans);

    }
}
