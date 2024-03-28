package BinaryTree;
import java.util.*;
public class BottomView {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static class Pair<K,V>{
        K key;
        V value;
        Pair(K key, V value){
            this.key = key;
            this.value = value;
        }
        K getKey(){
            return key;
        }
        V getValue(){
            return value;
        }
    }
    public static void bottomView (Node root, HashMap<Integer,Integer>map){
        if(root==null){
            return;
        }
        Queue<Pair<Node,Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root,0));
        while(q.size()!=0){
            Pair<Node,Integer> pair  = q.poll();
            Node temp = pair.getKey();
            int hd = pair.getValue();
            map.put(hd,temp.data);
            if(temp.left!=null){
                q.add(new Pair<>(temp.left,hd-1));
            }
            if(temp.right!=null){
                q.add(new Pair<>(temp.right,hd+1));
            }
        }
       
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
       HashMap<Integer,Integer> map = new HashMap<>();
       bottomView(root,map);
       ArrayList<Integer> ans = new ArrayList<>();
       for(int value : map.values()){
        ans.add(value);
       }
       System.out.println(ans);
    //    for(Map.Entry<Integer,Integer> m : map.entrySet()){
    //     System.out.print(m.getValue()+" ");
    //    }
    }
}
