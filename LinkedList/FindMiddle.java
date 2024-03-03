package LinkedList;

public class FindMiddle {
    public static class Node{
        int data;
        Node next;
        
        Node tail = null;
        Node(int data){
            this.data = data;
        }

    }

    public static Node middle(Node head){
        Node slow = head;
         Node fast = head;
         while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
         }
         return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next =c; 
        c.next = d;
        Node ans = middle(a);
        System.out.println(ans.data);

    }
}
