package Sorting;
import java.util.*;

public class alternatesorting {
    static void alternatesort(int arr[], int n){
        Arrays.sort(arr);
        int i=0, j=n-1;
        while(i<j){
            System.out.print(arr[j--]+" ");
            System.out.print(arr[i++]+" ");
        }
        if(n%2!=0){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,5,4,9,8,7};
        int n = arr.length;
        alternatesort(arr, n);
    }
}
