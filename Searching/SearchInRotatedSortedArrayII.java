package Searching;

public class SearchInRotatedSortedArrayII {

    public static boolean check(int[]arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                  return true;
            }
            if(arr[low]==arr[mid] && arr[high]==arr[mid]){
                low++;
                high--;
            }
            else if(arr[mid]<=arr[high]){
                  if(target>arr[mid] && target<=arr[high]){
                    low = mid+1;
                  }
                  else{
                    high = mid-1;
                  }
            }
            else{
                if(target>=arr[low] && target<arr[mid]){
                    high = mid-1;
                }
                else{
                    low= mid+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1};
        int target =0;
        boolean ans = check(arr,target);
        System.out.println(ans);
    }
}
