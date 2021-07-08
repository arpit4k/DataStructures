package Questions;
//To calculate minimum number of jumps to reach end of an array
public class minjumps {
    static int minimum(int arr[], int n){
        if(n<=1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        int maxreach = arr[0];
        int step = arr[0];
        int jump =1;
        for(int i=1; i<n; i++){
            if(i==n-1){
                return jump;
            }
            maxreach =  Math.max(maxreach, i+arr[i]);
            step--;
            if(step==0){
                jump++;
                if(i>=maxreach){
                    return -1;
                }
                step=maxreach-i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int n = arr.length;
        int min = minimum(arr, n);
        System.out.println("The minimum number of jumps is: "+min);
    }
}
