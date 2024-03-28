package BinaryTree;

public class LargestSubtreeSum {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    static int ans = Integer.MIN_VALUE;
    public static int dfs(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.data;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int curr = left +right +root.data;
        int temp = Math.max(left,Math.max(right,curr));
        ans = Math.max(ans,temp);
        return curr;
    }
    public static int largestSubtree(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.data;
        }
        int ans = dfs(root);
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(-2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(-6);
        Node f = new Node(2);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        int ans = largestSubtree(root);
        System.out.println(ans);
    }
    
}
