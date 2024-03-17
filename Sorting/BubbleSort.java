package Sorting;

public class BubbleSort {
    public static int[] bubbleSort(int[]arr){
        int n = arr.length;
        int count =0;
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                count++;
            }
        }
        System.out.println(count);
        return arr;
    }

    public static int[] optimizeBubbleSort(int[]arr){
        int n = arr.length;
        boolean flag = false;
        int count =0;
        for(int i =0;i<n;i++){
            flag = false;
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
                count++;
            }
            System.out.println(count);
            if(flag==false){
                return arr;
            }
        }
        System.out.println(count);
        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={2,15,4,8,3};
        int ans [] = bubbleSort(arr);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        int ans2 [] = optimizeBubbleSort(arr);
        for(int i =0;i<ans2.length;i++){
            System.out.print(ans2[i]+" ");
        }
    }
}
