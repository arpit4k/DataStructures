package Arrays.RotationAndArrangementReArrangement;


public class pushallzeroestoend {
    void pushZero(int arr[], int n){
        int count =0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<n){
            arr[count++]=0;
        }
    }
    void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        pushallzeroestoend push = new pushallzeroestoend();
        int arr[] = {1,3,5,0,6,0,8,0,9};
        push.pushZero(arr, 9);
        push.printArray(arr, 9);
    }    
}
