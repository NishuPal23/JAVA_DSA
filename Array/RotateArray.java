package Array;

/*Rotate an array to the right by k steps. */


public class RotateArray {

    //Time Complexity = O(n)
    //Sace Complexity = O(1)
    public static void reverse(int[]arr, int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotateKSteps(int[]arr, int k){
        int n = arr.length;
          reverse(arr,0,n-1);
          reverse(arr,0,k-1);
          reverse(arr,k,n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k =2;
        rotateKSteps(arr,k);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
}
}