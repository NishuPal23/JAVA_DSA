package BinaryTree;

public class ConstructTreeFromInorderAndPostorder {
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
    public static Node buildTree(int[]in, int[]post, int[] index, int inorderStart, int inorderEnd, int n){
        if(index[0]<0 || inorderStart>inorderEnd){
            return null;
        }
        int element = post[index[0]];
        index[0] = index[0]-1;
        Node root = new Node(element);
        int position = findPosition(in,element);
       
        root.right = buildTree(in,post,index,position+1,inorderEnd,n);
        root.left = buildTree(in,post,index,inorderStart,position-1,n);
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
        int in[] = {4,8,2,5,1,6,3,7};
        int[]post = {8,4,5,2,6,7,3,1};
        int n = in.length;
        int postorderIndex[] = {n-1};
        Node ans = buildTree(in,post,postorderIndex,0,n-1,n);
        inorder(ans);
    }
}
