package Array;
import java.util.*;
/*Given an array of integers, find two numbers such that they add up to a specific target number.*/


public class TwoSum {

    //Time Complexity = O(n^2)
    //Space Complexity = O(1)
    public static int[] findPair(int[]arr, int target){
        int[]ans = new int[2];
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
               if(arr[i]+arr[j]== target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;

               }
            }
        }
        return ans;
    }


    //Time Complexity = O(n)
    //Space Complexity = O(n)
    public static int[] findPair2(int[]arr, int target){
        int[]ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                   ans[0] = i;
                   ans[1] = map.get(target-arr[i]);
            }
            else{
                map.put(arr[i],i);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[] ={2,7,11,15};
        int target = 9;
        int ans[] = findPair2(arr,target);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
