package Searching;

public class MissingElementInSortedArray {
    public static int missingElement(int[]arr){
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==mid+1){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low+1;
    }
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5, 6, 8};
        int ans = missingElement(arr);
        System.out.println(ans);
    }
}
