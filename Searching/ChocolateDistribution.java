package Searching;

public class ChocolateDistribution {
    public static boolean isPossible(int[]arr,int mid, int m){
        int choco = 0;
        int noOfStudent = 1;

        for(int i=0;i<arr.length;i++){
             if(arr[i]>mid){
                return false;
             }
             if(choco+arr[i]<=mid){
                choco+=arr[i];
             }
             else{
                noOfStudent++;
                choco=arr[i];
             }
        }
        if(noOfStudent>m){
            return false;
        }
        return true;
    }
    public static int solve(int[]arr, int m){
        int n = arr.length;
        int start = 0;
        int end = (int)1e9;
        int ans = 0;
        while(start<end){
            int mid = (end+(end-start))/2;
            if(isPossible(arr,mid,m)){
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
        int[]arr = {12,34,67,90};
        int m = 2;
        int ans = solve(arr,m);  
        System.out.println(ans);
    }
}
