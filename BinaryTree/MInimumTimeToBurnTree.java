package BinaryTree;
import java.util.*;
public class MInimumTimeToBurnTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    //step1
    public static Node createMapping(Node root, int target, HashMap<Node,Node>map){
        Queue<Node> q = new LinkedList<>();
        map.put(root,null);
        q.add(root);
        Node res = null;
        while(q.size()!=0){
            Node temp =  q.peek();
            q.poll();
            if(temp.data == target){
                res = temp;
            }
            if(temp.left!=null){
                map.put(temp.left,temp);
                q.add(temp.left);
            }
            if(temp.right!=null){
                map.put(temp.right,temp);
                q.add(temp.right);
            }

            
        }
        return res;
    }

    //step 2
    public static int burnTree(Node root,HashMap<Node,Node>map){
        HashMap<Node,Boolean> visited = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        visited.put(root,true);
        int ans = 0;
        
        while(q.size()!=0){
            boolean flag = false;
            int n = q.size();
            for(int i =0;i<n;i++){
                Node temp = q.peek();
                q.poll();
                if(temp.left!=null && !visited.containsKey(temp.left)){
                    flag =  true;
                    visited.put(temp.left,true);
                    q.add(temp.left);
                }
                if(temp.right!=null && !visited.containsKey(temp.right)){
                    flag =  true;
                    visited.put(temp.right,true);
                    q.add(temp.right);
                }
                if(map.get(temp)!=null && !visited.containsKey(map.get(temp))){
                    flag =  true;
                    visited.put(map.get(temp),true);
                    q.add(map.get(temp));
                }

            }
            if(flag){
                ans++;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(9);
        Node i = new Node(10);
    
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        d.left = f;
        d.right = g;
        e.right = h;
        h.right = i;

        //step1 => create parent to child mapping and find targetNode
        HashMap<Node,Node> map = new HashMap<>();
        int target = g.data;
        Node targetNode = createMapping(root,target,map);

        //Burn tree
        int ans = burnTree(targetNode,map);
        System.out.println(ans);



        
    }
}
