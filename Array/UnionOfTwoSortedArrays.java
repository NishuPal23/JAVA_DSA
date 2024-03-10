package Array;
import java.util.*;
public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> union(int []arr1, int[]arr2){
        int i =0;
        int j =0;
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        while(  j<m && i<n){
            if(arr1[i]<arr2[j]){
               ans.add(arr1[i]);
               i++;
            }
            else if(arr1[i]>arr2[j]){
                ans.add(arr2[j]);
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
            //System.out.println(ans);
        }
        while(i<n){
           ans.add(arr1[i]);
           i++;
        }
        while(j<m){
            ans.add(arr2[j]);
            j++;
         }
         return ans;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        ArrayList<Integer> ans = union(arr1,arr2);
        System.out.println(ans);
    }
}
