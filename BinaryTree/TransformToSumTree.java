package BinaryTree;

public class TransformToSumTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static int solve(Node root){
        if(root==null){
            return 0;
        }
        
        int oldData = root.data;
        root.data = solve(root.left)+solve(root.right);
        return oldData+root.data;
    }
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void sumTree(Node root){
        solve(root);
        preorder(root);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(2);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        sumTree(root);
    }
}
