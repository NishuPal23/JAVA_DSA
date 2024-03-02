package Array;
import java.util.*;
public class MergeIntervals {

    //Time Complexity = O(n)
    //Space Complexity = O(n);
    public static int[][] merge(int[][]arr){
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> list = new LinkedList<>();
        for(int[]interval:arr){
            if(list.isEmpty() ||list.getLast()[1]<interval[0]){
                list.add(interval);
            }
            else if(list.getLast()[1]>interval[0]){
                list.getLast()[1] = Math.max(list.getLast()[1],interval[0]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        int ans[][] = merge(arr);
        for(int i =0;i<ans.length;i++){
            for(int j = 0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
