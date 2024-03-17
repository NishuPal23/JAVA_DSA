package Sorting;

public class MergeSort {
    public static void merge(int[]arr, int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-(mid+1)+1;
        int[]left = new int[n1];
        int[]right = new int[n2];
        for(int i =0;i<n1;i++){
            left[i] = arr[i+low];
        }
        for(int j = 0;j<n2;j++){
            right[j] = arr[j+mid+1];
        }
        int l1 =0;
        int r1 =0;
        int k =low;
        while(l1<n1 && r1<n2){
             if(left[l1]<right[r1]){
                arr[k] = left[l1];
                k++;
                l1++;
             }
             else{
                arr[k] = right[r1];
                r1++;
                k++;
             }
        }
        while(l1<n1){
            arr[k] = left[l1];
            k++;
            l1++;
        }
        while(r1<n2){
            arr[k] = right[r1];
            k++;
            r1++;
        }
    }
    public static void mergeSort(int[]arr,int low, int high){
        if(low==high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int arr[] ={2,15,4,8,3};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
