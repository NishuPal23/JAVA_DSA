package Recursion;

public class ReverseArray {
    public static void reverse(int[]arr,int i, int j){
        if(i>j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr,i+1,j-1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
         reverse(arr,0,n-1);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
