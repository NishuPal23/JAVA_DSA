package Stack;

public class ImplementNStackInAnArray {
    int k ;
    int []top;
    int []arr;
    int freeSpot;
    int next[];
    int size;
    ImplementNStackInAnArray (int qn, int size){
        k = qn;
        this.size = size;
        top = new int[qn];
        for(int i=0;i<k;i++){
            top[i] = -1;
        }
        freeSpot =0;
        next = new int[size];
        for(int i =0;i<size-1;i++){
            next[i] = i+1;
        }
        next[size-1] = -1;
        arr = new int[size];

    }

    void push(int data, int qn){
        //check overflow
        if(freeSpot ==-1){
            System.out.println("overflow");
             return;
        }
        //find index;
        int index = freeSpot;

        //update freeSpot
        freeSpot = next[index];

        //insert element
        arr[index] = data;

        //update next 
        next[index] = top[qn];


        //update top 
        top[qn] = index;
    }


    //pop
    int pop(int qn){
        //check underflow
        if(top[qn] == -1){
            System.out.println("empty");
            return -1;
        }
        int index = top[qn];
        top[qn] = next[index];
        next[index] = freeSpot;
        freeSpot = index;
        return arr[index];
        

    }

    public static void main(String[] args) {
        ImplementNStackInAnArray ks = new ImplementNStackInAnArray(3, 10);
        ks.push(15, 2);
        ks.push(45, 2);
 
        // Let us put some items in stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);
 
        // Let us put some items in stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);
 
        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }
}
