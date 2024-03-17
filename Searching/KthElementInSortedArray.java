package Searching;

import java.util.Arrays;

public class KthElementInSortedArray {
    public static int find(int[]arr1,int[]arr2,int n, int m, int k){
         int l1 = 0;
        int l2 =0;
        while(l1<n && l2<m){
            if(arr1[l1]<arr2[l2]){
                l1++;
            }
            else if(arr1[l1]>=arr2[l2]){
                int temp = arr1[l1];
                arr1[l1] = arr2[l2];
                arr2[l2] = temp;
                l1++;
                Arrays.sort(arr2);
            }
            else{
                l1++;
                l2++;
            }
        }
        for(int i =0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        int ans = -1;
        if(k<=n){
            ans = arr1[k-1];
        }
        else{
            int idx = k-n;
            ans = arr2[idx-1];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[] = {6,6,9,10,12,12,13,13};
        int n = arr1.length;
        int arr2[] = {6,7,9,9,12,13};
        int m = arr2.length;
        int k = 9;
        int ans = find(arr1,arr2,n,m,k);
        System.out.println(ans);

    }
}
