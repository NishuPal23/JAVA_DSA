package Array;
/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array. */
public class MoveZeroes {

    //Time Complexity = O(n^2)
    //Space Complexity = O(1)
    public static void move1(int[]arr){
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
    }

    //Time Complexity = O(n)
    //Space Complexity = O(1)
    public static void move2(int[]arr){
        int n = arr.length;
         int index =0;
         for(int i=0;i<n;i++){
             if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
             }
         }
    }
    public static void main(String[] args) {
        int[]arr = {0,1,0,3,12};
        move2(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
