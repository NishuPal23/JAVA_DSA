package Searching;
import java.util.*;
public class AggresiveCows {
    public static boolean isPossible(int[]arr, int n, int m, int mid){
        int cowPlaced = 1;
        
        int lastCow = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-lastCow>=mid){
                cowPlaced++;
                lastCow = arr[i];
            }
        }
        return (cowPlaced>=m);
    }
    public static int maximalMinima(int[]arr , int m){
        Arrays.sort(arr);
        int n = arr.length;
        int start =0;
        int end = (int)1e9;
        int ans = 0;
        while(start<end){
            int mid = (end+(end-start))/2;
            if(isPossible(arr,n,m,mid)){
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
        int arr[] = {4,2,1,3,6};
        int m = 2;
        int ans = maximalMinima(arr,m);
        System.out.println(ans);
    }
}
