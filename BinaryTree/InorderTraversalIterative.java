package BinaryTree;
import java.util.*;
public class InorderTraversalIterative {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void inorderIterative(Node root){
            Stack<Node> st = new Stack<>();
            st.push(root);
            while(st.size()!=0){
                 Node temp = st.peek();
                 if(temp.left!=null){
                    st.push(temp.left);
                    temp.left=null;
                 }
                 else{
                    System.out.println(temp.data);
                    st.pop();
                    if(temp.right!=null){
                        st.push(temp.right);
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
        
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        inorderIterative(root);

    }
}
