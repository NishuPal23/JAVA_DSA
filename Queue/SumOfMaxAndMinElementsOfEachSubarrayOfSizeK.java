package Queue;

import java.util.ArrayDeque;
import java.util.*;

public class SumOfMaxAndMinElementsOfEachSubarrayOfSizeK {
    public static int MaxMinSum(int[]arr, int k){
        int n = arr.length;
        int ans[] = new int[n-k+1];
        Deque<Integer> mini = new ArrayDeque<>();
        Deque<Integer> maxi = new ArrayDeque<>();
        int sum =0;

        //first k group 
        for(int i =0;i<k;i++){
            while(!maxi.isEmpty() && arr[maxi.peekLast()]<=arr[i]){
                maxi.removeLast();
            }
            while(!mini.isEmpty() && arr[mini.peekLast()]>=arr[i]){
                mini.removeLast();
            }
           maxi.addLast(i);
           mini.addLast(i);

        }

        //store ans
        if(maxi.size()!=0&&mini.size()!=0 ){
            ans[0] = arr[mini.peek()]+arr[maxi.peek()];
        }
        else{
            ans[0] = 0;
        }
         int index =1;
        //process rest of array
        for(int i = k;i<n;i++){

            //store ans
            //sum+=arr[maxi.peek()]+arr[mini.peek()];
            //removal
            if(!maxi.isEmpty() &&i-maxi.peek()>=k){
                maxi.removeFirst();
            }
            if(!mini.isEmpty() &&i-mini.peek()>=k){
                mini.removeFirst();
            }

            //addition
            while(!maxi.isEmpty() && arr[maxi.peekLast()]<=arr[i]){
                maxi.removeLast();
            }
            while(!mini.isEmpty() && arr[mini.peekLast()]>=arr[i]){
                mini.removeLast();
            }
            maxi.addLast(i);
            mini.addLast(i);

            //store data
            if(maxi.size()!=0&&mini.size()!=0 ){
                ans[index++] = arr[mini.peek()]+arr[maxi.peek()];
            }
            else{
                ans[index++] = 0;
            }
           

        }
        //sum+=arr[maxi.peek()]+arr[mini.peek()];
        for(int i =0;i<ans.length;i++){
            sum+=ans[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,-1,7,-3,-1,-2};
        int k =4;
        int ans =MaxMinSum(arr,k);
        System.out.println(ans);
    }
}
