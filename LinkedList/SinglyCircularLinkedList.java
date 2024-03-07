package LinkedList;

public class SinglyCircularLinkedList {
    public static class Node{
          int data;
          Node next;
          Node(int data){
            this.data = data;
          }
    }

    public static class Implementation{
        Node head = null;
        Node tail = null;
        int size =0;


        //insert at start
        public void insertAtBeginning(int val){
            Node a = new Node(val);
            if(head ==null){
                head = a;
                tail = a;
                head.next = tail;
                size++;
                return;
            }
            a.next = head;
            head = a;
            tail.next = a;
            size++;
        }


        //insert at end
        public void insertAtEnd(int val){
            Node a = new Node(val);
            if(head ==null){
                head = a;
                tail = a;
                head.next = tail;
                size++;
                return;
            }
            tail.next = a;
            tail = a;
            tail.next = head;
            size++;
        }


        //insert at any index
        public void insertAtAnyIndex(int val, int index){
            Node a = new Node(val);
              if(size==0){
                head = a;
                tail = a;
                head.next = tail;
                size++;
                return;
              }
              if(index==0){
                insertAtBeginning(val);
                return;
              }
              if(index==size){
                insertAtEnd(val);
                return;
              }
              Node temp = head;
              for(int i=1;i<index;i++){
                temp = temp.next;
              }
              a.next = temp.next;
              temp.next = a;
              size++;
        }

        //delete at start
        public int deleteStart(){
            if(head==null){
                System.out.println("empty");
                return -1;
            }
            int ans = head.data;
            head = head.next;
            tail.next = head;
            size--;
            return ans;
        }

        //delete End
        public int deleteEnd(){
            if(head==null){
                System.out.println("empty");
                return -1;
            }
            Node temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            int ans = temp.next.data;
            temp.next = head;
            tail = temp;
            size--;
            return ans;
        }

        //delete at any index
        public int deleteAtAnyIndex(int index){
            if(head==null){
                System.out.println("empty");
                return -1;
            }
            if(index==0){
                return deleteStart();
            }
            if(index==size-1){
                return deleteEnd();
            }
            Node temp = head;
            for(int i = 1;i<index;i++){
                temp = temp.next;
            }
            int ans = temp.next.data;
            temp.next = temp.next.next;
            size--;
            return ans;
        }

        //size
        public int size(){
            
            return size;

        }


        //display()
        public void display(){
            if(head==null){
                System.out.println("empty");
            }
            Node temp = head.next;
            System.out.print(head.data+" ");
            while(temp!=head){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Implementation cl = new Implementation();
        cl.insertAtBeginning(3);
        cl.insertAtBeginning(2);
        cl.insertAtBeginning(1);
        cl.display();
        cl.insertAtEnd(4);
        cl.insertAtEnd(5);
        cl.insertAtEnd(6);
        cl.display();
        cl.insertAtAnyIndex(7, 2);
        cl.insertAtAnyIndex(0, 0);
        cl.insertAtAnyIndex(9, 8);
        System.out.println("tail: "+cl.tail.data);
        System.out.println("tail next : "+cl.tail.next.data);
        cl.display();
        System.out.println("delete start "+cl.deleteStart());
        cl.display();
        System.out.println("delete end : "+cl.deleteEnd());
        cl.display();
        System.out.println("delete at any index : "+cl.deleteAtAnyIndex(2));
        cl.display();
        System.out.println("delete at 0 index: "+cl.deleteAtAnyIndex(0));
        cl.display();
        System.out.println("delete at last index : "+ cl.deleteAtAnyIndex(cl.size-1));
        cl.display();
        System.out.println("tail next : "+cl.tail.next.data);

    }
}
