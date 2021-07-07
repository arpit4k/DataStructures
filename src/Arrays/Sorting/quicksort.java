package Sorting;

public class quicksort {
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j<=high; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }
    static void quick(int arr[], int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quick(arr, low, pi-1);
            quick(arr, pi+1, high);
        }
    }
   public static void main(String[] args) {
       int arr[]={1,7,9,5,4,6,3};
       int n = arr.length;
       System.out.print("Before : ");
       for(int i=0; i<n;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println("");
       System.out.print("After : ");
       quick(arr, 0, n-1);
       for(int j=0; j<n;j++){
        System.out.print(arr[j]+" ");
    }
   }
}
