package LinkedList;

public class RemoveNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        
        Node tail = null;
        Node(int data){
            this.data = data;
        }

    }
    
    //In two traversal
    public static Node remove1(Node head, int n){
        Node temp = head;
        int size =0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        if(size==1)return null;
        if(size==n)return head.next;
        int left = size-n;
        temp = head;
        for(int i= 1;i<left;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }


    //in one traversal
    public static Node remove2(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i =1;i<=n;i++){
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow= slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
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
        
        int n =2;
        Node ans = remove2(a,n);
        display(ans);
    }
}
