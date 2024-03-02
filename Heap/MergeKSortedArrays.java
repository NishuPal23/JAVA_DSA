package Heap;
import java.util.*;
public class MergeKSortedArrays {
    public static class HeapNode{
        int value;
        int arrayIndex;
        int position;
        HeapNode(int value, int arrayIndex, int position){
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.position = position;
        }
    }
    public static class HeapNodeCompare implements Comparator<HeapNode>{
                 public int compare(HeapNode n1 , HeapNode n2){
                   return n1.value-n2.value;
                 }
    }
    public static int[] merge(int[][]arrays){
        int k = arrays.length;
        int totalElements = 0;

        // Calculate the total number of elements across all arrays
        for (int i = 0; i < k; i++) {
            totalElements += arrays[i].length;
        }

        int[] result = new int[totalElements];
        int resultIndex = 0;

        // Create a min heap to store elements along with their array index and position
        PriorityQueue<HeapNode> minHeap = new PriorityQueue<>(new HeapNodeCompare());

        // Insert the first element from each array into the min-heap
        for (int i = 0; i < k; i++) {
            if (arrays[i].length > 0) {
                minHeap.offer(new HeapNode(arrays[i][0], i, 0));
            }
        }

        // While the min-heap is not empty
        while (!minHeap.isEmpty()) {
            // Extract the minimum element from the min-heap
            HeapNode node = minHeap.poll();

            // Add the extracted element to the result
            result[resultIndex++] = node.value;

            // If there are more elements in the same array, insert the next element into the min-heap
            if (node.position + 1 < arrays[node.arrayIndex].length) {
                minHeap.offer(new HeapNode(arrays[node.arrayIndex][node.position + 1], node.arrayIndex, node.position + 1));
            }
        }

        return result;

    }
    public static void main(String[] args) {
        int[][]arr = {{1, 3, 5, 7},{2, 4, 6, 8},{0, 9, 10, 11}};
        int ans[] = merge(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
