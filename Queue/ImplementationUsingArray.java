package Queue;

public class ImplementationUsingArray {
    public static class Implementation{
        int queue[] = new int[5];
        int rear = -1;
        int front = -1;

        //add
        public void add(int val){
            if(rear ==queue.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(rear == -1 && front ==-1){
                rear=0;
                front =0;
                queue[rear] = val;
                return;
            }
            rear++;
            queue[rear] = val;

        }


        //remove
        public int remove(){
            if(rear==-1 && front==-1){
                 System.out.println("Queueu is emplty");
                 return -1;
            }
            if(rear==0 && front==0){
                int ans = queue[front];
                front =-1;
                rear = -1;
                return ans;
            }
            int ans = queue[front];
            front++;
            return ans;

        }


        //peek
        public int peek(){
            if(size()==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return queue[front];
        }

        //size
        public int size(){
            if(rear ==-1 && front==-1){
             System.out.println("queue is empty");
             return 0;
            }
            return rear-front+1;
        }


        //display
        public void display(){
            for(int i = front ;i<=rear;i++){
                System.out.print(queue[i]+" ");
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
