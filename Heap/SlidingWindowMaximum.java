package Heap;
import java.util.*;
public class SlidingWindowMaximum {
    public static class Pair{
        int index;
        int value;
        Pair(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
    public static ArrayList<Integer> slidingMax(int[]arr, int k){
         int n = arr.length;
         PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.value-a.value);
         ArrayList<Integer> ans = new ArrayList<>();
         for(int i =0;i<k;i++){
            pq.add(new Pair(i,arr[i]));
         }
         ans.add(pq.peek().value);
         for(int i =k;i<n;i++){
            pq.add(new Pair(i,arr[i]));
            if(pq.peek().index<i-k){
                pq.poll();
            }
            ans.add(pq.peek().value);
         }
         return ans;
         
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,1,4,5,2,3,6};
        int n = arr.length;
        int k = 3;
        ArrayList<Integer> ans = slidingMax(arr,k);
        System.out.println(ans);
    }
}
