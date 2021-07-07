package Arrays.RotationAndArrangementReArrangement;

public class ReverseArray {
    void reversearr(int arr[], int n){
        int i, temp;
        for(i=0; i<n; i++,n--){
            temp = arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
        }
    }
    void printarray(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        ReverseArray reverse = new ReverseArray();
        int arr[] = {5,6,8,9,1};
        reverse.reversearr(arr, 5);
        reverse.printarray(arr, 5);
    }
}
