package Arrays.OrderStatitstics;
import java.util.Scanner;
//This program is for unsorted array
public class Kthsmallestunsorted {
   static void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 =r-m;
        int L[]= new int[n1];
        int R[]= new int[n2];
        for(int i=0; i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0; j<n2;j++){
            R[j]=arr[m+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int l, int r){
        if(l<r){
            int m = l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr, l, m, r);
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    static int kth(int arr[], int k){
        return arr[k-1];
    }
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        Scanner sc = new Scanner(System.in);
        System.out.print("Original Array: ");
        printArray(arr);
        System.out.println("");
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();
        Kthsmallestunsorted obj = new Kthsmallestunsorted();
        obj.sort(arr, 0, arr.length-1);
        System.out.print("Sorted Array: ");
        printArray(arr);
        int temp = kth(arr, k);
        System.out.println("The "+k+"th smallest element is: "+temp);
        sc.close();
    }

}
