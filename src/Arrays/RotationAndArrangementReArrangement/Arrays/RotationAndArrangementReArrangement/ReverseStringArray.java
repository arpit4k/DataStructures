package Arrays.RotationAndArrangementReArrangement;

public class ReverseStringArray {
    void reversearr(char arr[], int n){
        int i;
        char temp;
        for(i=0; i<n; i++,n--){
            temp = arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
        }
    }
    void printarray(char arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        ReverseStringArray reverse = new ReverseStringArray();
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
        reverse.reversearr(arr, 5);
        reverse.printarray(arr, 5);
    }
}
