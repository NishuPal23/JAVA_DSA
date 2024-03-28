package BinaryTree;
import java.util.*;
public class LeftView {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void leftView(Node root,ArrayList<Integer> ans,int level) {
        if(root==null){
            return ;
        }
        if(level==ans.size()){
            ans.add(root.data);
        }
        leftView(root.left,ans,level+1);
        leftView(root.right,ans,level+1);
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
        ArrayList<Integer> ans = new ArrayList<Integer>();
        leftView(root,ans,0);
        System.out.println(ans);
    }
}
