package BinaryTree;

public class CalculateMaximumValue {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static int max(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }
   public static void main(String[] args) {
    Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        c.left = g;
        int ans = max(root);
        System.out.println(ans);
   } 
}
