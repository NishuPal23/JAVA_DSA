package Recursion;
import java.util.*;
public class SubsetSum1 {
    public static void solve(int[]arr, int i, ArrayList<Integer> ans, int sum){
        int n = arr.length;
        if(i==n){
            ans.add(sum);
            return;
        }
        solve(arr,i+1,ans,sum+arr[i]);
        solve(arr,i+1,ans,sum);
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        ArrayList<Integer> ans = new ArrayList<>();
        int sum =0;
        solve(arr,0,ans,sum);
        System.out.println(ans);
    }
}
