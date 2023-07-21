
/**
 * Hariharan
 */
import java.util.*;

// import java.lang.*;
public class PrimeNumberNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n + 1];
        for (int i = 2; i <= (int) (Math.sqrt(n)); i++) {
            if (arr[i] == 0) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = j;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                System.out.print(i + " ");
            }
        }

    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     sc.close();
        
    //      if (prime(n, 2)) {
    //             System.out.println("Prime Number");
    //         } else {
    //             System.out.println("Not a Prime Number");
    //         }
    
    //   }
    //   public static boolean  prime(int n, int d){
    // if (n <= 2) {
    //         return (n == 2);
    //         }
    
    //         if (n % d == 0) {
    //             return false;
    //         }
    
    //         if (d * d > n) {
    //             return true;
    //         }
    
    //         return prime(n, d + 1);
    }
}