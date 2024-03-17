package Sorting;

public class SelectionSort {
    public static int[] selectionSort(int[]arr){
        int n = arr.length;
        int min =0;
        for(int i =0;i<n;i++){
            min=i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={2,15,4,8,3};
        int ans[] = selectionSort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
