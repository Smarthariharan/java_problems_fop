import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        int i = 1;
        sc.close();

        while (factorial <= n) {
            if (factorial == n) {
                System.out.println("Yes");
                return;
            }
            factorial *= i;
            i++;
        }
        System.out.println("No");
        sc.close();
    }
}
