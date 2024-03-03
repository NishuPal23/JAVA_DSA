package LinkedList;

public class DetectCycle {
    public static class Node{
        int data;
        Node next;
        
        Node tail = null;
        Node(int data){
            this.data = data;
        }

    }

    public static boolean detect(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null){
            slow = slow.next;
            if(fast.next==null)return false;
            fast= fast.next.next;
            if(slow==fast)return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next =c; 
        c.next = d;
        d.next = b;

        boolean ans = detect(a);
        System.out.println(ans);
    }
}
