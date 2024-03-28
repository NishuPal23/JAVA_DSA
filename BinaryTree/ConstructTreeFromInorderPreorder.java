package BinaryTree;

public class ConstructTreeFromInorderPreorder {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static int findPosition(int[]in, int element){
        for(int i =0;i<in.length;i++){
            if(in[i]==element){
                return i;
            }
        }
        return -1;
    }
    public static Node buildTree(int[]in, int[]pre, int[] index, int inorderStart, int inorderEnd, int n){
        if(index[0]>=n || inorderStart>inorderEnd){
            return null;
        }
        int element = pre[index[0]];
        index[0]=index[0]+1;
        Node root = new Node(element);
        int position = findPosition(in,element);
        root.left = buildTree(in,pre,index,inorderStart,position-1,n);
        root.right = buildTree(in,pre,index,position+1,inorderEnd,n);
        return root;
        
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int []in = {1,6,8,7};
        int []pre = {1,6,7,8};
        int[]preorderIndex = {0};
        int n = in.length;
        Node ans = buildTree(in,pre,preorderIndex,0,n-1,n);
        inorder(ans);
    }
}
