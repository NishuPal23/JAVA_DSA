package LinkedList;

public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }

    public static void displayRev(Node tail){
            Node temp = tail;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.prev;
            }
    }

    public static void displayUsingRandomNode(Node a){
        Node temp =a;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        a.prev = null;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.prev = d;

        //displayRev(e);

        displayUsingRandomNode(c);



    }
}
