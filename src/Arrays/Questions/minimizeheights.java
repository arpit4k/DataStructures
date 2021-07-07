package Questions;

import java.util.*;

public class minimizeheights {
    // This program adds or subtracts K to heights such that difference between max height and minimum height is minimum
    static int minimize(int arr[], int n, int k){
        Arrays.sort(arr);
        int answer = arr[n-1]-arr[0];
        int low =  arr[0]+k;
        int high = arr[n-1]-k;
        if(low>high){
            int temp = low;
            low=high;
            high=temp;
        }
        for(int i=1;i<n-1;i++){
            int sub = arr[i]-k;
            int add = arr[i]+k;
            if(sub>=low || add<=high ){
                continue;
            }
            if(high-sub<=add-low){
                low=sub;
            }
            else{
                high=add;
            }
        }
        return Math.min(answer, high-low);
    }
    public static void main(String[] args) {
        int arr[] = {1, 15,10};
        int n = arr.length;
        int k = 6;
        System.out.println("Maximum difference is "+minimize(arr, n, k));
    }
}
