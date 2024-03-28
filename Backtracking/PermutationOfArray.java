package Backtracking;
import java.util.*;
public class PermutationOfArray {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void solve(int[]arr,int idx, ArrayList<ArrayList<Integer>> ans){
        if(idx==arr.length-1){
            ArrayList<Integer> l = new ArrayList<>();
            for(int i =0;i<arr.length;i++){
                l.add(arr[i]);
            }
            ans.add(l);
            return;
        }
        for(int i = idx;i<arr.length;i++){
            swap(arr,i,idx);
            solve(arr,idx+1,ans);
            swap(arr,i,idx);
        }
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        solve(arr,0,ans);
        System.out.println(ans);
    }
    
}
