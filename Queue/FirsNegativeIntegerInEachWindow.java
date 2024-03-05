package Queue;
import java.util.*;
public class FirsNegativeIntegerInEachWindow {

    //Approach 1
    public static int[] negativeInteger(int[]arr, int k){
        int n = arr.length;
        int ans[] = new int[n-k+1];
        Queue<Integer>q = new LinkedList<>();
         for(int i =0;i<n;i++){
            if(arr[i]<0){
                q.add(i);
            }
         }
         for(int i =0;i<n-k+1;i++){
            if(q.size()>0 && q.peek()<i){
                q.remove();
            }
            if(q.size()>0 && q.peek()<=i+k-1){
                ans[i] = arr[q.peek()];
            }
            else if(q.size()==0){
                ans[i] =0;
            }
            else{
                ans[i] =0;
            }
         }
         return ans;

    }


    //Approach 2  using deque
    public static int[] firstNegative(int[]arr,int k){
        int n = arr.length;
        int ans[] = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        //process first window of k size
        for(int i =0;i<k;i++){
            if(arr[i]<0){
                dq.addLast(i);
            }
        }
        //store answer of first k size window
        if(dq.size()>0){
            ans[0] = arr[dq.peek()];
        }
        else{
            ans[0] =0;
        }

        //process rest window
        int index=1;
        for(int i=k;i<n;i++){
            //removal
            if(!dq.isEmpty() && i-dq.peek()>=k){
                dq.removeFirst();
            }

            //addition
            if(arr[i]<0){
                dq.addLast(i);
            }

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
        int[]arr = {12,-1,-7,8,-15,30,16,28};
        int k = 2;
        int ans[] = negativeInteger(arr,k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
         System.out.println();
        int ans2[] = firstNegative(arr,k);
        for(int i=0;i<ans2.length;i++){
            System.out.print(ans2[i]+" ");
        }
    }
}
