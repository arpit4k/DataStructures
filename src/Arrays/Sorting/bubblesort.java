package Sorting;
import java.util.*;
public class bubblesort {
    static void sort(int arr[], int n){
        boolean swap;
        for(int i=0; i<n-1; i++){
            swap = false;
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap = true;
                }
            }
            if(swap==false)
               break;
        }
    }
    static void printArray(int arr[],int n){
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter input in array: ");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        bubblesort.sort(arr, n);
        System.out.print("Sorted Array: ");
        printArray(arr, n);
        sc.close();
        
    }
    
}
