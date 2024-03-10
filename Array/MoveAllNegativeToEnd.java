package Array;

public class MoveAllNegativeToEnd {
    //order not matter
    public static int[] move(int[]arr){
        int n = arr.length;
       int start =0;
       int end = n-1;
       while(start<=end){
        if(arr[start]>=0 && arr[end]<0){
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
        }
        else if(arr[end]<0){
            int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
        }
        else{
            start++;
            end--;
        }
       }
       return arr;
    }
    public static void main(String[] args) {
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int ans[] = move(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
