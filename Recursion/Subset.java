package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void solve(int[]arr, int index,List<List<Integer>> ans, List<Integer> ll){
        ans.add(new ArrayList<>(ll));
        for(int i= index;i<arr.length;i++){
            ll.add(arr[i]);
            solve(arr,i+1,ans,ll);
            ll.remove(ll.size()-1);//backtrack
        }
     }
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        
        solve(arr,0,ans,ll);
        System.out.println(ans);
    }
}
