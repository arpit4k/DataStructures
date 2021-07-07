package Arrays.RotationAndArrangementReArrangement;


class Rotation {
    void RotateArray(int arr[], int d, int n){
        for(int i=0; i<d;i++){
            RotateArraybyOne(arr, n);
        }
    }
    void RotateArraybyOne(int arr[], int n){
        int temp = arr[0];
        for(int i=0; i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    void PrintArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void  main(String[] args){
        Rotation rotate = new Rotation();
        int arr[] = {1,2,3,4,5,6,7,8};
        rotate.RotateArray(arr, 3, 8);
        rotate.PrintArray(arr, 8);
    }
}