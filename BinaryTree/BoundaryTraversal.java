package BinaryTree;

public class BoundaryTraversal {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void leftTraversal(Node root){
        if(root.left==null && root.right==null){
            return;
        }
        if(root.left==null){
            leftTraversal(root.right);
        }
        System.out.print(root.data +" ");
        leftTraversal(root.left);
    }
    public static void leafTraversal(Node root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            System.out.print(root.data+" ");
            return;
        }
        
        
        leafTraversal(root.left);
        leafTraversal(root.right);
    }
    public static void rightTraversal(Node root){
        if(root.left==null && root.left==null){
            return;
        }
        if(root.right==null){
            rightTraversal(root.left);
        }
        rightTraversal(root.right);
        System.out.print(root.data+" ");
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

        leftTraversal(root);
        leafTraversal(root);
        rightTraversal(root.right);
    }
}
