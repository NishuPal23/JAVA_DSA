package Queue;

public class CircularQueue {
    int arr[] = new int[5];
    int front =-1;
    int rear = -1;
    int size =0;

    //add
    public void add(int val){
        if(size()==0){
            front =0;
            rear =0;
            arr[rear] = val;
            size++;
        
        }
        else if(size()==arr.length){
            System.out.println("Queue is full");
            return;
        }
        else if(rear==arr.length-1){
            rear=0;
            arr[rear] = val;
            size++;
        }
        else if(rear<arr.length-1){
            rear++;
            arr[rear] = val;
            size++;
        }
    }


    //pop
    public int remove(){
        if(rear==-1 && front==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        else if(front==arr.length-1){
            int ans = arr[front];
            front =0;
            size--;
            return ans;
        }
        else{
            int ans = arr[front];
            front++;
            size--;
            return ans;
        }
    }

    //size
    public int size(){
          return size;
    }

    //display
    public void display(){
        if(size()==0){
            System.out.println("empty");
            return;
        }
        else if(front<=rear){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else if(rear<front){
            for(int i=front;i<=arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
            for(int j=0;j<=rear;j++){
                System.out.print(arr[j]+" ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.add(1);
        cq.add(2);
        cq.add(3); 
        cq.add(4);
        cq.add(5);
        cq.display();  
        cq.remove();
        cq.display();
        cq.add(6);
        cq.display();

    }
}
