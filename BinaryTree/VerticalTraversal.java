package BinaryTree;
import java.util.*;
public class VerticalTraversal {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static  void verticalTraversal(Node root,int hd,Map<Integer, ArrayList<Integer> > map){
            if(root==null){
                return;
            }
            ArrayList<Integer> arr = map.get(hd);
            if(arr==null){
                arr = new ArrayList<Integer>();
                arr.add(root.data);
            }
            else{
                arr.add(root.data);
            }
            map.put(hd,arr);
            verticalTraversal(root.left,hd-1,map);
            verticalTraversal(root.right,hd+1,map);
            

    }
    public static void main(String[] args) {
        Node root = new Node(4);
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(3);
        Node g = new Node(6);
    
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        d.left = g;
        Map<Integer, Vector<Integer> > m = new TreeMap<Integer,Vector<Integer>>();
    }
}
