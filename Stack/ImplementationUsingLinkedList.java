package Stack;

public class ImplementationUsingLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class Implementation{
        Node head = null;
        int size =0;

        //push
        public void push(int val){
            Node a = new Node(val);
            if(head ==null){
                head = a;
                size++;
                return;
            }
            a.next = head;
            head = a;
            size++;
            
        }


        //pop
        public int pop(){
            if(head==null){
                System.out.println("stack underflow");
                return -1;
            }
            int ans = head.data;
            head = head.next;
            size--;
            return ans;
        }


        //peek
        public int peek(){
            if(head==null){
                System.out.println("stack underflow");
                return -1;
            }
            return head.data;
        }

        //isEmpty
        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }


        //display
        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
            System.out.println();
        }

        
    
    }
    public static void main(String[] args) {
        Implementation st = new Implementation();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();

        //pop
        System.out.println("popped Element :"+st.pop());
        System.out.println("size: "+ st.size);
        System.out.println("peek element : "+st.peek());
        st.display();

        System.out.println("is Empty : "+st.isEmpty());
        


    }
    
}
