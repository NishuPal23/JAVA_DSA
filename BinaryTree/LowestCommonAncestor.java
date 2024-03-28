package BinaryTree;

public class LowestCommonAncestor {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean isContain(Node root, Node p ,Node q){
        
        if(root==null){
            return false; 
        }
        System.out.println(root.data);
        if(root==p || root == q){
            return true;
        }
        return isContain(root.left,p,q) || isContain(root.right,p,q);
    }

    public static Node  LCA(Node root,Node p, Node q){
        
        if(root==p || root == q){
            return root;
        }
        System.out.println("lca"+root.data);
        if(p==q)return p;
        boolean left = isContain(root.left,p,q);
        boolean right = isContain(root.right,p,q);
        if(left && right || !left && !right){
            return root;
        }
        if(left && !right){
            LCA(root.right,p,q);
        }
        if(!left && right){
            LCA(root.left,p,q);
        }
        return root;
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
    Node ans = LCA(root, c, d);
    System.out.println(ans.data);
    }
}
