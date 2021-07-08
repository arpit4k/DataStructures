package Questions;

import java.util.*;
// This program is to merge two sorted arrays without adding extra space

public class mergetwosorted {
    static void merge(int arr1[], int arr2[]){
        int n =  arr2.length;
        int i=0;
        int temp=0;
        while(arr1[n-1]>arr2[0]){
            if(arr1[i]>arr2[0]){
            temp = arr1[i];
            arr1[i]=arr2[0];
            arr2[0]=temp;
            Arrays.sort(arr2);
        }
        i++;
    }
}

static void printarr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+", ");
    }
    
}
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {2,4,6,8};
        merge(arr1, arr2);
        System.out.print("The first array after sort merge: {");
        printarr(arr1);
        System.out.print("}");
        System.out.println();
        System.out.print("The second array after sort merge: {");
        printarr(arr2);
        System.out.print("}");

    }
}
