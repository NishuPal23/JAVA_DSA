package LinkedList;

public class DeleteFromCircularLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
          this.data = data;
        }
  }

  public static void delete(Node head, int key){
    if(head==null)return;
    if(head.data==key && head.next==head)return ;
    if(head.data==key){
        head = head.next;
    }
    Node temp = head;
    while(temp.next.data!=key){
        temp=temp.next;
    }
    temp.next = temp.next.next;
    
  }

  //display
  public static void display(Node head){
    if(head==null)return ;
    System.out.print(head.data+" ");
    Node temp = head.next;
    while(temp!=head){
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
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;
        int key = 3;
        delete(a,key);
        display(a);
    }
    
}
