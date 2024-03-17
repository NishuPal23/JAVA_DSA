package Searching;

public class KukuEatsBanana {

    public static int solve(int[]arr, int mid){
        int totalHour =0;
        for(int i=0;i<arr.length;i++){
            totalHour+=Math.ceil(arr[i]/mid);
        }
        return totalHour;
    }
    public static int eat(int[]arr,int h){
        int n = arr.length;
        int start =1;
        int end = -1;
        for(int i=0;i<n;i++){
            end = Math.max(end,arr[i]);
        }
        int ans = 0;
        while(start<end){
            int mid = start+(end-start)/2;
            int minHour = solve(arr,mid);
            if(minHour<=h) {
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
        int arr[] ={3,6,7,11};
        int h = 8;
        int ans = eat(arr,h);
        System.out.println(ans);
    }
}
