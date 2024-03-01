package Heap;

import java.util.ArrayList;

public class BuildMaxHeap {
    public static void swap(ArrayList<Integer> arr,int i , int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    public static void pushDown(ArrayList<Integer> arr , int idx, int n){
        if(idx==n){
            return;
        }
        int max = idx;
        int left = 2*idx+1;
        int right = 2*idx+2;
        if(left<=n && arr.get(left)>arr.get(max)){
            max = left;
        }
        if(right<=n && arr.get(right)>arr.get(max)){
            max = right;
        }
        if(max ==idx){
            return;
        }
        swap(arr,max,idx);
        pushDown(arr,max,n);
    }
    public static void buildMaxHeap(ArrayList<Integer> arr){
        int n = arr.size()-1;
        int idx = (n-1)/2;
        for(int i = idx;i>=0;i--){
            pushDown(arr,i,n);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(5);
        arr.add(15);

        buildMaxHeap(arr);
        System.out.println(arr);
    }
}
