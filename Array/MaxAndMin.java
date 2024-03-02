package Array;
/*Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array. */
public class MaxAndMin {
    //TimeComplexity = O(n)
    //SpaceComplexity = O(1)
    public static int findSum(int[]arr){
        int n = arr.length;
        if(n==1)return arr[0]+arr[0];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                max = Math.max(arr[i],max);
                min = Math.min(arr[i+1],min);
            }
            else{
                max = Math.max(arr[i+1],max);
                min = Math.min(arr[i],min);
            }
        }
        return max+min;
    }
    public static void main(String[] args) {
        int[]arr = {-2, 1, -4, 5, 3};
        int ans = findSum(arr);
        System.out.println(ans);
    }
    
}
