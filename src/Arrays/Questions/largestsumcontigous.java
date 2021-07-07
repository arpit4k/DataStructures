package Questions;

public class largestsumcontigous {
    static int max(int arr[], int n){
        int max = Integer.MIN_VALUE;
        int current = 0;
        for(int i=0; i<n; i++){
            current = current + arr[i];
            if(max<current){
                max = current;
            }
            if(current<0){
                current=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-5,1,4,-3,1};
        int n = arr.length;
        int max = max(arr, n);
        System.out.println("The max contigous sum is: "+max);
    }
}
