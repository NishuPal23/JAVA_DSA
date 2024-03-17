package Array;
import java.util.*;
public class MergeTwoSortedArray {
    public static void merge(int[]arr1, int[]arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i =0;
        int j = 0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i++;
                Arrays.sort(arr2) ;
            }
            else{
                i++;
                j++;
            }
        }

    }
    public static void main(String[] args) {
        int[]arr1 = {1,5,9,10,15};
        int arr2[] = {2,3,8,13};
        merge(arr1,arr2);
        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i =0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
