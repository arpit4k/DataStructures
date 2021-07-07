package Arrays.OrderStatitstics;

public class threelargest {
    static void printthreelargest(int arr[], int n){
        if(n<3){
            System.out.println("Invalid input");
            return;
        }
        int F, S, T;
        F = S = T = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int x = arr[i];
            if(x>F){
                T=S;
                S=F;
                F=x;
            }
            else if(x>S){
                T=S;
                S=x;
            }
            else if(x>T){
                T=x;
            }

        }
        System.out.println("The three lagest elements are "+F+", "+S+", "+T);
    }
    public static void main(String[] args) {
        int arr[] =  {3,7,9,8,2};
        int n = arr.length;
        printthreelargest(arr, n);
    }
    
}
