package LinkedList;

public class ImplementationOfDoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }

    public static class DoublyLinkedList{
        Node head = null;
        Node prev = null;
        Node tail = null;
        


        //insert at start
        public  void insertAtBeginning(int val){
            Node a = new Node(val);
            if(head==null){
              head = a;
              tail = a;
              return;
            }

            a.next = head;
            a.prev = null;
            head.prev = a;
            head = a;
            
        }

        //insert at end
        public  void insertAtEnd(int val){
            Node a = new Node(val);
            if(head==null){
              head = a;
              tail = a;
              return;
            }

            tail.next = a;
            a.prev=tail;
            tail = a;
        }

        //insert at any index
        public void insertAtAnyIndex(int idx, int val){

            Node a = new Node(val);
            if(size()==0){
                head = a;
                tail = a;
                return;
            }
            if(idx==0){
               insertAtBeginning(val);
               return;
            }
            if(size()==idx){
               insertAtEnd(val);
            }
            Node temp = head;
            for(int i=1;i<idx;i++){
                temp = temp.next;
            }
            a.next = temp.next;
            temp.next.prev = a;
            temp.next = a;
            a.prev = temp;

        }


        //deletion start
        public int deleteBeginning(){
            if(head==null){
                System.out.println("empty");
                return -1;
            }
            int ans = head.data;
            head = head.next;
            head.prev = null;
            return ans;
        }


        //delete end
        public int deleteEnd(){
            if(head==null){
                System.out.println("empty");
                return -1;
            }
            int ans = tail.data;
            tail = tail.prev;
            tail.next = null;
            return ans;
        }

        //deletion at any index
        public int deleteAnyIndex(int idx){
            if(size()==0){
                System.out.println("empty");
                return -1;
            }
            if(idx==0){
                return deleteBeginning();
                
            }
            if(idx==size()-1){
               return  deleteEnd();
            }
            Node temp = head;
            for(int i = 1;i<idx;i++){
                temp = temp.next;
            }
            int ans = temp.next.data;
            temp.next = temp.next.next;
            temp.next.prev = temp;
            return ans;
        }

        //display
        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }


        //size
        public int size(){
            Node temp = head;
            int count =0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertAtBeginning(3);
        dl.insertAtBeginning(2);
        dl.insertAtBeginning(1);
        dl.display();
        System.out.println("tail prev : "+dl.tail.prev.data);
        dl.insertAtEnd(4);
        dl.insertAtEnd(5);
        dl.display();
        System.out.println("delete start : "+dl.deleteBeginning());
        dl.display();
        System.out.println("delete end : " +dl.deleteEnd());
        dl.display();
        System.out.println("delete at any index : "+dl.deleteAnyIndex(2));
        dl.display();
        System.out.println("head : "+dl.head.data);
        System.out.println("tail : "+dl.tail.data);
        System.out.println("tail prev : "+dl.tail.prev.data);

    }
}
