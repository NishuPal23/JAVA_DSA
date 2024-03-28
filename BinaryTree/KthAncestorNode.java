package BinaryTree;

public class KthAncestorNode {
    static Node temp = null;
    static int k;
    static Node res;

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    static Node kthAncestorDFS(Node root,int node){
        //System.out.println(k);
        if (root == null)
        return null;
     
    if (root.data == node||
    (temp = kthAncestorDFS(root.left,node)) != null ||
    (temp = kthAncestorDFS(root.right,node)) != null)
    { 
        if (k > 0)     
            k--;
         
        else if (k == 0)
        {
            // print the kth ancestor
            //System.out.print("Kth ancestor is: "+root.data);
             res = root;
            // return null to stop further backtracking
            return null;
        }
         
        // return current node to previous call
        return root;
    }
    return null;
        
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
        k=3;
        int node = 5;
        Node ans = kthAncestorDFS(root,node);
       
        if(ans!=null){
            System.out.println(-1);
        }
        else{
            System.out.println(res.data);
        }
        
    }
}
