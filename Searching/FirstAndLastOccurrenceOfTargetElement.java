package Searching;

public class FirstAndLastOccurrenceOfTargetElement {
    public static int[] firstLastOccurrence(int[]nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans1 = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                ans1 = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        low=0;
        high = nums.length-1;
        int ans2 =-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                ans2 = mid;
                low = mid+1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        int ans[] = new int[2];
        ans[0] = ans1;
        ans[1] = ans2;
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {5,7,7,8,8,10};
        int target = 8;
        int[]ans = firstLastOccurrence(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
