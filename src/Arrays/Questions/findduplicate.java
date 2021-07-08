package Questions;
import java.util.*;
public class findduplicate {
    static int find(int arr[], int n){
        Arrays.sort(arr);
        for(int i=0; i<n;i++){
            if(arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arr: ");
        int n = sc.nextInt();
        System.out.println();
        int arr[] = new int[n];
        System.out.println("Enter elements of arr: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int dup = find(arr, n);
        if(dup==-1){
            System.out.println("There is no duplicate element.");
        }
        else{
             System.out.println("The duplicate element is: "+dup);
        }
        sc.close();
    }
}
