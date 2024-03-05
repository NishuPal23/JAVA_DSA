package Queue;

public class ImplementationUsingLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }
    }

    public static class Implementation{
        Node head=null;
        Node tail =null;
        int size =0;

        //add
        public void add(int val){
            Node a = new Node(val);
            if(head ==null){
                head = a;
                tail = a;
                size++;
                return ;
            }
            tail.next = a;
            tail = a;
            size++;
        }


        //remove
        public int remove(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;
            }
            int ans = head.data;
            head= head.next;
            size--;
            return ans;
        }


        //peek
        public int peek(){
            if(head ==null){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }

        //size
        public int size(){
            return size;
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
    }
    public static void main(String[] args) {
        Implementation i = new Implementation();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
        //i.add(6);
        i.display();

        //remove
        System.out.println("size is : "+i.size());
        System.out.println("remove element : "+i.remove());
        System.out.println("size is : "+i.size());
        i.display();
        System.out.println("remove element : "+i.remove());
        System.out.println("remove element : "+i.remove());
        System.out.println("remove element : "+i.remove());
        System.out.println("remove element : "+i.remove());
        System.out.println("size is : "+i.size());    

        //peek
        System.out.println("peek element : "+i.peek());
    }
}
