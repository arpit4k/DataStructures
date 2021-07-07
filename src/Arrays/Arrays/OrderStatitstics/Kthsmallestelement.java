package Arrays.OrderStatitstics;


//This program is for sorted array
public class Kthsmallestelement {
    public void findkth(int arr[], int k){
        System.out.println(arr[arr.length-k]); //arr[k-1] when the array is ASCENDING 
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5}; //DESCENDING SORTED
        //Can also use "Arrays.sort(arr)" to sort the array
        int k = 2; //2nd smallest elemement
        Kthsmallestelement obj  = new Kthsmallestelement();
        obj.findkth(arr, k);
        //Output is 6
    }
    
}
