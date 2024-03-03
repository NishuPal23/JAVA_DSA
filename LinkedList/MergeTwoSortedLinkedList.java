package LinkedList;

public class MergeTwoSortedLinkedList {
    public static class Node{
        int data;
        Node next;
        
        Node tail = null;
        Node(int data){
            this.data = data;
        }

    }

    public static Node merge(Node head1, Node head2){
            Node a = new Node(100);
            Node temp =a;
            Node h1 = head1;
            Node h2 = head2;
            while(h1!=null && h2!=null){
                if(h1.data<h2.data){
                    temp.next = h1;
                    temp = h1;
                    h1 = h1.next;
                }
                else{
                    temp.next = h2;
                    temp = h2;
                    h2 = h2.next;
                }
            }
            if(h1!=null){
                temp.next = h1;
            }
            if(h2!=null){
                temp.next = h2;
            }
            return a.next;
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
        Node c = new Node(4);
        a.next = b;
        b.next =c; 
        
        Node a2 = new Node(1);
        Node b2 = new Node(3);
        Node c2 = new Node(4);
        a2.next = b2;
        b2.next =c2; 

        Node ans = merge(a,a2);
        display(ans);
        
    }
}
