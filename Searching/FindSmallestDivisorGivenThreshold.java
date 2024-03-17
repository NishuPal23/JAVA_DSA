package Searching;

public class FindSmallestDivisorGivenThreshold {
    public static boolean isPossible(int[]arr, int mid, int m){
        int sum =0;
             for(int i =0;i<arr.length;i++){
                   sum+=Math.ceil(arr[i]/mid);
             }
             if(sum<=m){
                return true;
             }
             return false;
    }
    public static int find(int []arr, int m){
        int start =0;
        int end = -1;

        for(int i =0;i<arr.length;i++){
            end = Math.max(arr[i],end);

        }
        int ans = -1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(isPossible(arr,mid,m)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[] ={1,2,5,9};
        int m = 6;
        int ans = find(arr,m);
        System.out.println(ans);
    }
}
