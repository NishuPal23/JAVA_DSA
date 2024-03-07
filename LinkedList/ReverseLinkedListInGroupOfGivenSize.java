package LinkedList;

public class ReverseLinkedListInGroupOfGivenSize {
    public static class Node{
        int data;
        Node next;
        
        Node tail = null;
        Node(int data){
            this.data = data;
        }

    }

    public static Node ReverseKGroup(Node head, int k){
        if(head ==null)return head;
        if(head.next==null)return head;
        Node curr = head;
        Node currNext = null;
        Node prev = null;
        int count = 0;
        while(curr!=null && count<k){
            currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
            count++;
        }
        if(curr!=null){
            head.next = ReverseKGroup(curr,k);
        }
        return prev;
    }

    //display
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
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next =c; 
        c.next = d;
        d.next = e;
        e.next = f;
        

        int k =2;
        Node ans = ReverseKGroup(a,k);
        display(ans);
    }
}
