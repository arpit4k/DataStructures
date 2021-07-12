package Questions;
import java.util.*;
// IN this program we calculate the number of pairs whose sum is equal to a given number
public class countpair {
    static int countpairs(int arr[], int n, int k){
        int count = 0;
        for(int i=0;i<n; i++){
            for(int j=i+1; j<n;j++){
                if(arr[j]-arr[i]==k){
                    count++;
                }
            }
        }
        return count;
        //A better approach would be through hashmap
        // HashMap<Integer, Integer> hm = new HashMap<>();
         // // Store counts of all elements in map hm
        // for (int i = 0; i < n; i++) {
        //     // initializing value to 0, if key not found
        //     if (!hm.containsKey(arr[i]))
        //         hm.put(arr[i], 0);
        //     hm.put(arr[i], hm.get(arr[i]) + 1);
        // }
        // int twice_count = 0;
        // // iterate through each element and increment the
        // // count (Notice that every pair is counted twice)
        // for (int i = 0; i < n; i++) {
        //     if (hm.get(sum - arr[i]) != null)
        //         twice_count += hm.get(sum - arr[i]);
        //     // if (arr[i], arr[i]) pair satisfies the
        //     // condition, then we need to ensure that the
        //     // count is decreased by one such that the
        //     // (arr[i], arr[i]) pair is not considered
        //     if (sum - arr[i] == arr[i])
        //         twice_count--;
        // }
        // // return the half of twice_count
        // return twice_count / 2;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter K: ");
    int k = sc.nextInt();
    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();
    System.out.print("Enter the elements of array: ");
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    int count =  countpairs(arr, n, k);
    System.out.println("The number of pairs are: "+count);
    sc.close();
    }
    
}
