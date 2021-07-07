package Sorting;

public class insertionsort{
    void sort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
    void print(int arr[]){
        int n = arr.length;
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6};
        insertionsort obj = new insertionsort();
        System.out.print("The array before sorting: ");
        obj.print(arr);
        System.out.println("");
        System.out.print("The array after insertion sorting: ");
        obj.sort(arr);
        obj.print(arr);
    }
}
