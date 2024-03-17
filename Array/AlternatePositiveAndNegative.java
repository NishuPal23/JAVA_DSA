package Array;

public class AlternatePositiveAndNegative {
    public static void rightRotate(int[]arr, int out,int i){
        int temp = arr[i];
        for(int j = i;j>out;j--){
            arr[j] = arr[j-1];
        }
        arr[out] = temp;
    }
    public static void alternate(int[]arr){
        int outOfPlace = -1;
        for(int i =0;i<arr.length;i++){
            if(outOfPlace>=0){
                if(arr[i]>=0 && arr[outOfPlace]<0 || arr[i]<0 && arr[outOfPlace]>=0){
                    rightRotate(arr,outOfPlace,i);
                    if(i-outOfPlace>=2){
                        outOfPlace+=2;
                    }
                    else{
                        outOfPlace = -1;
                    }
                }
            }
            if(outOfPlace ==-1){
                if((arr[i]>=0 && i%2==0) || arr[i]<0 && i%2!=0){
                    outOfPlace = i;
                }
            }
        }
    }
   public static void main(String[] args) {
    int arr[] ={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
    alternate(arr);
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
   } 
}
