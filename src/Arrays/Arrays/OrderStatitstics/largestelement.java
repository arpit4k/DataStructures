package Arrays.OrderStatitstics;


public class largestelement {
    static int arr[] = {3,1,4,8,7,10};
    static int largest(){
        int maximum = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        return maximum;

    }
    public static void main(String[] args) {
        System.out.println("The largest element is "+largest());
    }
}
