package Array;

public class MaximumSubarraySum {
    //Time Complexity = O(n^3)
    //Space Complexity = O(1)
    public static int maxSum1(int[]arr){
        int n = arr.length;
        if(n==1)return arr[0];
        int sum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            for(int j = i;j<n;j++){
                for(int k = i;k<=j;k++){
                    sum +=arr[k];
                }
                maxSum = Math.max(sum,maxSum);
                sum =0;
            }
        }
        return maxSum;
    }

    //Time Complexity = O(n^2)
    //Space Complexity = O(1)
    public static int maxSum2(int[]arr){
        int n = arr.length;
        if(n==1)return arr[0];
        int maxSum =Integer.MIN_VALUE;;
        int sum =0;
        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                sum+=arr[j];
                maxSum = Math.max(sum,maxSum);
            }
            sum =0;
        }
        return maxSum;
    }

    //Time Complexity = O(n)
    //Space Complexity = O(1)
    public static int maxSum3(int[]arr){
          int n = arr.length;
          int maxSum = Integer.MIN_VALUE;
          int sum =0;
          for(int i=0;i<n;i++){
            sum += arr[i];
            maxSum = Math.max(sum,maxSum);
            if(sum<0){
                sum =0;
            }
          }
          return maxSum;

    }
    public static void main(String[] args) {
        int arr[] ={-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSum3(arr);
        System.out.println(ans);
    }
}
