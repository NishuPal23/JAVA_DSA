package Array;
/*Given an array containing n distinct numbers taken from the range 0 to n, find the one that is missing. */
public class MissingNumber {

    //Time Complexity = O(n)
    //Space Complexity = O(1)
    public static int missing(int[]arr){
        int n = arr.length;
        int arrSum = 0;
        for(int i=0;i<n;i++){
            arrSum+=arr[i];
        }
        int actualSum = n*(n+1)/2;
        return actualSum-arrSum;
    }
   public static void main(String[] args) {
      int arr[] ={3,0,1};
      int ans = missing(arr);
      System.out.println(ans);
   } 
}
