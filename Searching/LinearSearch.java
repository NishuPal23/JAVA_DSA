package Searching;

public class LinearSearch {
    //TimeComplexity = O(n)
    //Space Complexity = O(1)
    
    public static int findIndex(int[]arr, int target){
          for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
          }
          return -1;
    }
    public static void main(String[] args) {
        int arr[] = {14,2,6,8,5};
        int target =6;
        int ans = findIndex(arr,target);
        System.out.println(ans);
    }
}
