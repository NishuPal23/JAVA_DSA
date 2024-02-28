package GreedyAlgorithm;
import java.util.*;
/*Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum */
public class chocolateDistribution {
    //Time complexity = O(nlogn)
    //Space Compexity = O(1)
    public static int solve(int[]arr, int n, int m){
        Arrays.sort(arr);
        if(m>n){
            return -1;
        }
        int ans =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int temp = i+m-1;
            if(temp>=n){
                break;
            }
            int diff = arr[temp]-arr[i];
            ans = Math.min(diff,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,9,56,7,9,12};
        int m = 5;
        int n = arr.length;
        int ans = solve(arr,n,m);
        System.out.println(ans);
    }
}
