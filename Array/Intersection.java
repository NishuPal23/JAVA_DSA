package Array;
import java.util.*;
public class Intersection {
    public static ArrayList<Integer> intersection(int[]arr1, int[]arr2){
        int i =0;
        int j = 0;
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                  ans.add(arr1[i]);
                  i++;
                  j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6} ;
        ArrayList<Integer> ans = intersection(arr1,arr2);
        System.out.println(ans);
    }
}
