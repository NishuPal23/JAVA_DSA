package LinkedList;

public class ReverseIterative {
    public static class Node{
        int data;
        Node next;
        
        Node tail = null;
        Node(int data){
            this.data = data;
        }

    }
    public static Node reverse(Node head){
        Node curr = null;
        Node prev = null;
        Node currNext = head;
        while(currNext!=null){
            curr = currNext;
            currNext = currNext.next;
            curr.next = prev;
            prev = curr;
        }
        return curr;
    }

    //Display
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
   }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next =c; 
        c.next = d;

        Node ans =reverse(a);
        display(ans);
        
    }
}
