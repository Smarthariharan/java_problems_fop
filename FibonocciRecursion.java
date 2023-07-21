import java.util.Scanner;

public class FibonocciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibo(n);
        sc.close();
        System.out.println("The term " + n + " in the fibonacci series is " + result);
    }

    public static int fibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
