package LinkedList;

public class ReverseRecursive {
    public static class Node{
        int data;
        Node next;
        
        Node tail = null;
        Node(int data){
            this.data = data;
        }

    }

    public static Node reverse(Node head){
        if(head ==null)return null;
        if(head.next==null)return head;
        Node newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
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
