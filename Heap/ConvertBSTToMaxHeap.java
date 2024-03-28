package Heap;
import java.util.*;
public class ConvertBSTToMaxHeap {
    static int index;
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void inorder(Node root, ArrayList<Integer> ans ){
        if(root==null){
            return ;
        }
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);

    }
    public static void preorder(Node root, ArrayList<Integer> ans ){
        if(root==null){
            return ;
        }
        root.data = ans.get(index++);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public static void preorderTraversal(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
       // System.out.println(ans);
       preorder(root,ans);
       preorderTraversal(root);

    }
}
