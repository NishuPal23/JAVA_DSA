package BinaryTree;

public class NthLevelTraversal {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void nthLeveltraversal(Node root, int level){
        if(root ==null){
            return ;
        }
        if(level==1){
            System.out.println(root.data);
            return;
        }
        nthLeveltraversal(root.left, level-1);
        nthLeveltraversal(root.right, level-1);
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
        int level =2;
        nthLeveltraversal(root,level);
    }
}
