package BinaryTree;

public class FlattenBinaryTreeIntoLinkedList {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void flatten(Node root){
        Node curr = root;
        while(curr!=null){
            if(curr.left!=null){
                Node pred = curr.left;
                while(pred.right!=null){
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
            }
            curr = curr.right;
        }
    }
    public static void traversal(Node root){
        Node temp = root;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.right;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        
    
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        c.right = f;
        flatten(root);
        traversal(root);
    }
}
