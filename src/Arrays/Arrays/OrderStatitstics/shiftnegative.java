package Arrays.OrderStatitstics;
//Shift all NEGATIVE elements of array to START 
public class shiftnegative {
    void shift(int arr[], int l, int r){
        while(l<=r){
            if(arr[l]<0 && arr[r]>0){
                l++;
                r--;
            }
            else if(arr[l]>0 && arr[r]<0){
                int temp = arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            else if(arr[l]<0 && arr[r]<0){
                l++;
            }
            else{
                r--;
            }
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={-12,11,-13,-5,6,-7,5,-3,11};
        System.out.print("The original array: ");
        printArray(arr);
        shiftnegative obj = new shiftnegative();
        obj.shift(arr, 0, arr.length-1);
        System.out.print("The new array is: ");
        printArray(arr);
    }
}
