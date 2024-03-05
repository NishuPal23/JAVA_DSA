package Queue;

import java.util.ArrayDeque;
import java.util.*;
public class MinElementInWindowSizeK {
    public static int[] firstMin(int[]arr,int k){
        int n = arr.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int ans[] = new int[n-k+1];
        for(int i =0;i<k;i++){
            while(!dq.isEmpty()&& arr[dq.peekLast()]>=arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        if(dq.size()>0){
            ans[0] = arr[dq.peek()];
        }
        else{
            ans[0] =0;
        }

        int index =1;
        for(int i =k;i<n;i++){
            //removal
            if(!dq.isEmpty() && i-dq.peek()>=k){
                dq.removeFirst();
            }
            //addition
            while(!dq.isEmpty()&& arr[dq.peekLast()]>=arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);

            //ans store
            if(dq.size()>0){
                ans[index++] = arr[dq.peek()];
            }
            else{
                ans[index++] =0;
            }
        }
        return ans;


    }
    public static void main(String[] args) {
        int arr[] ={1,4,2,6,7,9,3,5,8};
        int k = 2;
        int ans[] = firstMin(arr,k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
