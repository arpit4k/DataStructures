package Sorting;
// Sort array consisiting only 0, 1 & 2 WITHOUT any sorting algorithm 
public class sort012 {
    void sort(int arr[]){
        int count0=0, count1=0, count2=0;
        for(int i=0;i<arr.length;i++){
            switch(arr[i]){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<(count0+count1);i++){
            arr[i]=1;
        }
        for(int i=(count0+count1);i<(count0+count1+count2);i++){
            arr[i]=2;
        }
    }
    static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,2,1,0,2,1};
        System.out.print("The original array is: ");
        printArray(arr);
        System.out.print("The sorted array is: ");
        sort012 obj = new sort012();
        obj.sort(arr);
        printArray(arr);
    }
}
