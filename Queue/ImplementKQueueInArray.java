package Queue;

public class ImplementKQueueInArray {

        int n;
        int k;
        int []arr;
        int next[];
        int rear[];
        int []front;
        int freeSpot;
        ImplementKQueueInArray(int n, int k){
            this.n = n;
            this.k = k;
            arr = new int[n];
            front = new int[k];
            rear = new int[k];
            freeSpot =0;
            next = new int[n];
            for(int i=0;i<n-1;i++){
                next[i] = i+1;
            }
            next[n-1] = -1;
            for(int i=0;i<k;i++){
                front[i] = -1;
                rear[i] = -1;

            }

        }

        public void enqueue(int data, int qn){
            //check overflow
            if(freeSpot==-1){
                System.out.println("overflow");
            }

            //find the index
            int index = freeSpot;
            //update freespot
            freeSpot = next[index];
            //check for first
            if(front[qn-1]==-1){
                front[qn-1] = index;
            }
            else{
                next[rear[qn-1]]=index;
            }
            //update next
            next[index] = -1;
            //update rear
            rear[qn-1] = index;
            //push data
            arr[index] = data;
        }

        //dequeue
        public void dequeue(int qn){
            //overflow
            if(front[qn-1] ==-1){
                System.out.println("empty");
                return ;
            }
            //find index
            int index = front[qn-1];
            //front update
            front[qn-1] = next[index];
            //free slot manage;
            next[index] = freeSpot;
            freeSpot = index;

        }



    
    public static void main(String[] args) {
        
    }
}
