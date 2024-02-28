package GreedyAlgorithm;
import java.util.*;


/* There are given N ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to sum of their lengths.
The task is to connect the ropes with minimum cost. Given N size array arr[] contains the lengths of the ropes. */


public class MinimumCostOfRopes {

    //Time Complexity = O(n)
    //Space Complexity = O(n)
    public static int solve(int[]arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int ans = 0;
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            int sum =a+b;
            ans += sum;
            pq.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};
        int ans = solve(arr);
        System.out.println(ans);
    }
}
