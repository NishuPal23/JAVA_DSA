package BinaryTree;

public class SumOfLongestPath {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void solve(Node root, int maxLevel[] , int level, int sum, int maxSum[]){
        
        if(root==null ){
            if(level>maxLevel[0]){
                maxSum[0] = sum;
                maxLevel[0] = level;
            }
            else if(maxLevel[0]==level){
                maxSum[0] = Math.max(sum, maxSum[0]);
            }
            return;
        }
        solve(root.left,maxLevel,level+1,sum+root.data,maxSum);
        solve(root.right,maxLevel,level+1,sum+root.data,maxSum);
        
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


        int maxLevel[] ={0};
        int level = 0;
        int sum = 0;
        int maxSum[] = {Integer.MIN_VALUE};
        solve(root,maxLevel,level,sum,maxSum);
         System.out.println(maxSum[0]);

    }
}
