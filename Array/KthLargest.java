package Array;



import java.util.PriorityQueue;

public class KthLargest {

    //TimeComplexity = O(nlogk)
    //SpaceComplexity = O(k)
    public static int large(int[]arr, int k){
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            if(pq.size()==k){
                if(pq.peek()<arr[i]){
                    pq.remove();
                    pq.add(arr[i]);
                }
                continue;
            }
            pq.add(arr[i]);
        }
        return pq.peek();

    }
    public static void main(String[] args) {
        int arr[] ={7 ,10, 4, 3, 20, 15};
        int k =3;
        int ans = large(arr,k);
        System.out.println(ans);
    }
}
