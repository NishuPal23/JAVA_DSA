package Sorting;

public class QuickSort {
    public static int partition(int[]arr, int low, int high){
        int pivot = low;
        int pivotEle = arr[pivot];
        int i = low;
        for(int j = low+1;j<=high;j++){
            if(arr[pivot]>arr[j]){
                i = i+1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
        return i;

    }
    public static void quickSort(int[]arr, int low,int high){
        if(low<high){
        int m = partition(arr,low,high);
        quickSort(arr,low,m);
        quickSort(arr,m+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,15,4,8,3};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
