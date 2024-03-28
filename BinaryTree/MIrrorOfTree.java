package BinaryTree;

public class MIrrorOfTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    public static void inorder(Node root){
        if(root==null)return ;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);


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
        
        mirror(root);
        inorder(root);

    }
}
