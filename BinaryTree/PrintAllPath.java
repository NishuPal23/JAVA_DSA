package BinaryTree;
import java.util.*;
public class PrintAllPath {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void printPath(Node root,ArrayList<String> path, String str){
        if(root==null || root.left==null && root.right==null){
            str+=root.data;
            path.add(str);
            return;
        }
        printPath(root.left,path,str+root.data+"->");
        printPath(root.right,path,str+root.data+"->");
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
    
    ArrayList<String> path = new ArrayList<>();
    String str = "";
    printPath(root,path,str);
    System.out.println(path);
    
   } 
}
