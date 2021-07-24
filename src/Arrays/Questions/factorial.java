package Questions;
import java.math.BigInteger;
import java.util.*;
//Find factorial of a number
public class factorial {
    static BigInteger fact(int N){
        BigInteger f = new BigInteger("1");
        for(int i=2; i<=N; i++){
            f = f.multiply(BigInteger.valueOf(i));  
        }
        return f;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        System.out.print("Factorial is "+fact(N));
        sc.close();
         }
}
