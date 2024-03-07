package LinkedList;

public class findPairFromSortedDoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
          this.data = data;
        }
  }
  public static void pairSum(Node head, int target){
    Node start = head;
    Node end = head;
    while(end.next!=null){
        end = end.next;
    }
    boolean found = false;
    while(start!=end && end.next!=start){
        if(start.data+end.data==target){
            System.out.println(start.data+" "+end.data);
            found = true;
            start = start.next;
            end = end.next;
        }
        else if(start.data+end.data<target){
            start = start.next;
        }
        else{
            end = end.prev;
        }

    }
    if(found == false){
        System.out.println("Not found");
    }
  }
   public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(4);
    Node d = new Node(5);
    Node e = new Node(6);
    Node f = new Node(8);
    Node g = new Node(9);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;
    b.prev = a;
    c.prev = b;
    d.prev = c;
    e.prev = d;
    f.prev = e;
    g.prev = f;
    int target = 7;
    pairSum(a,target);
   } 
}
