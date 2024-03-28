package BinaryTree;
import java.util.*;
public class PreorderTraversalIterative {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void preorderIterative(Node root){
        Stack<Node> st = new Stack<>();
            st.push(root);
            while(st.size()!=0){
                 Node temp = st.pop();
                 
                 System.out.println(temp.data);
                 if(temp.right!=null){
                    st.push(temp.right);
                }
                 if(temp.left!=null){
                    
                    st.push(temp.left);
                    
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
        preorderIterative(root);
    }
}
