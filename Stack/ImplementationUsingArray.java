package Stack;

public class ImplementationUsingArray {
    public static class Implementation{
        int stack[] = new int[5];
        int size =0;

        //push
        public void push(int val){
            if(size==stack.length){
                System.out.println("Stack overflow");
                return;
            }
            stack[size] = val;
            size++;
        }

        //pop
        public int pop(){
            if(size==0){
                System.out.println("Stack underflow");
                return -1;
            }
            int ans = stack[size-1];
            size--;
            return ans;
        }

        //peek
        public int peek(){
            if(size==0){
                System.out.println("Stack underflow");
                return -1;
            }
            return stack[size-1];
        }

        //isEmpty
        public boolean isEmpty(){
            if(size==0){
               return true;
            }
            return false;
        }

        //isFull
        public boolean isFull(){
            if(size==stack.length){
                return true;
            }
            return false;
        }
        

        //display
        public  void display(){
            for(int i=0;i<size;i++){
                System.out.print(stack[i]+" ");
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
        st.push(5);
        st.display();
        System.out.println("size : "+st.size);
        //st.push(6);

        //pop
        System.out.println("poped element : "+st.pop());
        System.out.println("size : "+st.size);
        st.display();

        //peek
        System.out.println("peek element : "+st.peek());

        //isEmpty
        System.out.println("is Empty : "+ st.isEmpty());


        //isFull
        System.out.println("is Full : "+st.isFull());




    }
}
