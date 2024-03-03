package LinkedList;

public class Implementation {
    public static class Node{
        int data;
        Node next;
        
        Node tail = null;
        Node(int data){
            this.data = data;
        }

    }
    public static class LinkedListImplementation{
        Node head = null;
        Node tail = null;
        //insert in beginning
        public void insertBeginning(int val){
            Node a = new Node(val);
            if(head == null){
                head = a;
                tail = a;
                return;
            }
            a.next = head;
            head = a;

        }


        //insert at End
        public void insertEnd(int val){
            Node a = new Node(val);
            //if linkedlist is Empty
            if(head==null){
                head = a;
                tail = a;
                return;
            }
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = a;
            tail = a;
        }


        //insert at any position
        public void insertAtAnyIndex(int val, int pos){
            Node a = new Node(val);
            if(head==null){
                head = a;
                tail = a;
                return;
            }
            if(pos==0){
                insertBeginning(val);
                return;
            }
            if(pos==size()){
                insertEnd(val);
                return;
            }
            Node temp = head;
            for(int i =1;i<pos;i++){
                  temp=temp.next;
            }
            a.next = temp.next;
            temp.next = a;

        }

        //delete at any index
        public int delete(int pos){
            if(head==null){
                System.out.println("Linnked list is empty");
                return -1;
            }
            if(pos==0){
                int ans = head.data;
                head = head.next;
                return ans;
            }
            if(pos==size()-1){
               Node temp2 = head;
               for(int i=1;i<pos;i++){
                   temp2 = temp2.next;
               }
               int ans = temp2.data;
               temp2.next = temp2.next.next;
               tail = temp2;
               return ans;
            }
            Node temp = head;
            for(int i =1;i<pos;i++){
                temp = temp.next;
            }
            int ans = temp.next.data;
            temp.next=temp.next.next;
            return ans;
        }
        

        //size
        public int size(){
            Node temp = head;
            int count =0;
            while(temp!=null){
                temp = temp.next;
                count++;
            }
            return count;
        }

        //Display
        public  void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
       }
    }
    public static void main(String[] args) {
        LinkedListImplementation ll = new LinkedListImplementation();
        ll.insertBeginning(1);
        ll.display();
        ll.insertBeginning(2);
        ll.insertBeginning(3);
        ll.insertBeginning(4);
        ll.display();
        System.out.println("head is : "+ll.head.data);
        System.out.println("tail is : "+ll.tail.data);
        ll.insertEnd(5);
        ll.insertEnd(6);
        System.out.println("head is : "+ll.head.data);
        System.out.println("tail is : "+ll.tail.data);
        ll.display();
        ll.insertAtAnyIndex(7, 0);
        ll.insertAtAnyIndex(8, ll.size());
        ll.insertAtAnyIndex(9, 5);
        ll.insertAtAnyIndex(10, 8);
        ll.display();
        System.out.println("size is : "+ll.size());
        System.out.println("head is : "+ll.head.data);
        System.out.println("tail is : "+ll.tail.data);
        ll.delete(4);
        ll.delete(0);
        ll.delete(ll.size()-1);
        ll.display();
        System.out.println("size is : "+ll.size());
        System.out.println("head is : "+ll.head.data);
        System.out.println("tail is : "+ll.tail.data);
    }
}
