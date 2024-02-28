package GreedyAlgorithm;
import java.util.*;

/*In a candy store, there are N different types of candies available and the prices of all the N different types of candies are provided to you.
You are now provided with an attractive offer.
For every candy you buy from the store and get K other candies ( all are different types ) for free.
Now you have to answer two questions. Firstly, you have to find what is the minimum amount of money you have to spend to buy all the N different candies. Secondly, you have to find what is the maximum amount of money you have to spend to buy all the N different candies.
In both the cases you must utilize the offer i.e. you buy one candy and get K other candies for free. */


public class ShopInCandyStore {
    //Time Complexity = O(nlogn)
    //Space Complexity = O(1)
    public static int[] solve(int[]arr, int k, int n){
        Arrays.sort(arr);
              int i = 0;
              int j = n-1;
              int minAmount = 0;
              while(i<=j){
                 minAmount += arr[i];
                 j = j-2;
                 i++;
              }
              i= 0;
              j =n-1;
              int maxAmount = 0;
              while(i<=j){
                maxAmount += arr[j];
                i = i+2;
                j--;
             }
             int ans [] = new int[2];
             ans[0] = minAmount;
             ans[1] = maxAmount;
             return ans;
    }
    public static void main(String[] args) {
        int arr[] ={3,2,1,4};
        int k = 2;
        int n = arr.length;
        int ans[] = solve(arr, k,n);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
