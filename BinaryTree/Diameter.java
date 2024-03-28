package BinaryTree;

public class Diameter {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static int height(Node root){
        if(root==null || root.left==null && root.right==null){
            return 0;
        }
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public static int diameter(Node root){
        if(root==null || root.left==null && root.right==null){
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        int mid = height(root.left)+height(root.right);
        if(root.left!=null){
            mid++;
        }
        if(root.right!=null){
            mid++;
        }
        return Math.max(mid,Math.max(left,right));
    }
    public static void main(String[] args) {
    Node root = new Node(1);
    Node a = new Node(2);
    Node b = new Node(3);
    Node c = new Node(4);
    Node d = new Node(5);
    
    root.left = a;
    root.right = b;
    a.left = c;
    a.right = d;
    int ans = diameter(root);
    System.out.println(ans);
    }
}
