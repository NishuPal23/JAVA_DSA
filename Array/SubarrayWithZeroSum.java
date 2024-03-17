package Array;
import java.util.*;
public class SubarrayWithZeroSum {
    public static boolean checkZeroSum(int[]arr){
        int sum =0;
        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]==0 ||sum==0 ||set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,-3,1,6};
        boolean ans = checkZeroSum(arr);
        System.out.println(ans);
    }
}
