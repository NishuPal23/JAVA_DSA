package BinaryTree;

public class MorrisTraversal {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node findPred(Node root){
        Node temp = root.left;
        while(temp.right!=null && temp.right!=root){
            temp =  temp.right;
        }
        return temp;
    }
    public static void morrisTraversal(Node root){
        Node curr = root;
        while(curr!=null){
            if(curr.left==null){
                System.out.println(curr.data);
                curr = curr.right;
            }
            else{
                Node pred = findPred(curr);
                if(pred.right==null){
                    pred.right=curr;
                    curr = curr.left;
                }
                else{
                    pred.right=null;
                    System.out.println(curr.data);
                    curr = curr.right;
                }
            }
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

        morrisTraversal(root);
    }
}
