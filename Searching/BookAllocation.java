package Searching;

public class BookAllocation {
    public static boolean isPossible(int[]arr, int mid, int m, int n){
        int stuPlaced = 1;
        int choice =0;
        for(int i = 0;i<n;i++){
            if(arr[i]>mid){
                return false;
            }
            if(arr[i]+choice<=mid){
                choice+=arr[i];
            }
            else{
                stuPlaced++;
                choice = arr[i];
            }
        }
        if(stuPlaced>m){
            return false;
        }
        return true;
    }
    public static int minimalMaxima(int[]arr, int m){
        int n = arr.length;
        int start = 0;
        //int sum=0;
        // for(int i=0;i<n;i++){
        //      sum+=arr[i];
        // }
        int end = (int)1e9;
        
        int ans = 0;
        while(start<end){
            int mid = (end+(end-start))/2;
            if(isPossible(arr,mid,m,n)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={10,20,30,40};
        int m = 2;
        int ans = minimalMaxima(arr,m);
        System.out.println(ans);
    }
    
}
