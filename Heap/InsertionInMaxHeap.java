package Heap;

import java.util.ArrayList;

public class InsertionInMaxHeap {
    public static void swap(ArrayList<Integer> arr,int i , int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    public static void pushUp(ArrayList<Integer> arr,int idx){
        int parent  = (idx-1)/2;
        if(idx==0 ||arr.get(idx)<arr.get(parent)){
            return;
        }
        swap(arr,parent,idx);
        pushUp(arr,parent);
        
    }
    public static void insertion(ArrayList<Integer>arr, int insert){
              arr.add(insert);
              int n = arr.size()-1;
              pushUp(arr,n);
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
        int n = arr.size();
        int insert = 70;
        
        insertion(arr,insert);
        System.out.println(arr);
    }
}
