package Sorting;

public class InsertionSort {
    public static int[] insertionSort(int[]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={2,15,4,8,3};
        int ans[] = insertionSort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
