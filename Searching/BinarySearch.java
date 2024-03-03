package Searching;

public class BinarySearch {

    //TimeComplexity = O(logn)
    //Space Complexity = O(1)
    public static int binarySearch(int[]arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                ans = mid;
                return ans;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,7,8};
        int target = 8;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
}
