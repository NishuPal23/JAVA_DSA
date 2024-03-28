package BinaryTree;

public class MaxSumOfNonAdjacentNodes {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static Pair maxSum(Node root){
        if(root==null){
            Pair pair = new Pair(0,0);
            return pair;
        }
        Pair left = maxSum(root.left);
        Pair right = maxSum(root.right);
        Pair sum = new Pair(0,0);
        sum.first = root.data+left.second+right.second;
        sum.second = Math.max(left.first,left.second)+Math.max(right.first,right.second);
        return sum;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        
    
        root.left = a;
        root.right = b;
        a.left = c;
        b.left = d;
        b.right = e;
        
        Pair res = maxSum(root);
        int ans =  Math.max(res.first,res.second);
        System.out.println(ans);
        
    }
}
