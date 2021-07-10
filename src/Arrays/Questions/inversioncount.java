package Questions;
//IC depicts how far is an array from getting completely sorted
public class inversioncount {
    static int inversion(int arr[], int n){
        int count = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    count++;
                }
            }
        }
        return count;
    }
    static void printarr(int arr[], int n){
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
            
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        int n = arr.length;
        System.out.print("The array is: ");
        printarr(arr, n);
        int inv = inversion(arr, n);
        System.out.print("The inversion count is: "+inv);
        System.out.println();
        System.out.print("The sorted array is: ");
        printarr(arr, n);
    }
}
