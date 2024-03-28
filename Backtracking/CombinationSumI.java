package Backtracking;
import java.util.*;
public class CombinationSumI {
    public static void combinationSum(int[]arr, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> ans, int index){
        
        if(index==arr.length){
            if(target==0){
                
                result.add(new ArrayList<>(ans));
            }
            return;
        }
        if(arr[index]<=target){
            ans.add(arr[index]);
            combinationSum(arr,target-arr[index],result,ans,index);
            ans.remove(ans.size()-1);
        }
        combinationSum(arr,target,result,ans,index+1);

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int arr[] = {7,2,6,1};
        int target = 7;
        combinationSum(arr,target,result,ans,0);
       System.out.println(result);
    }
}
