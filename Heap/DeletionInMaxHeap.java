package Heap;

import java.util.ArrayList;

public class DeletionInMaxHeap {
    public static void swap(ArrayList<Integer> arr,int i , int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    public static void pushDown(ArrayList<Integer> arr, int idx){
        int n = arr.size()-1;
        if(idx==n)return;
        int max = idx;
        int left = 2*idx+1;
        int right = 2*idx+2;
        if(left<=n && arr.get(left)>arr.get(max)){
            max = left;
        }
        if(right<=n && arr.get(right)>arr.get(max)){
            max = right;
        }
        if(max==idx){
            return;
        }
        swap(arr,max,idx);
        pushDown(arr,max);
    }
    public static void deletion(ArrayList<Integer> arr){
        int n = arr.size()-1;
        swap(arr,0,n);
        arr.remove(n);
        pushDown(arr,0);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(60);
        arr.add(50);
        arr.add(40);
        arr.add(30);
        arr.add(20);
        arr.add(30);
        arr.add(10);
        deletion(arr);
        System.out.println(arr);
    }
}
