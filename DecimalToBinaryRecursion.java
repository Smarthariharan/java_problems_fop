import java.util.Scanner;

public class DecimalToBinaryRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int result = find(n);
        System.out.println(result);
    }

    public static int find(int n) {
        if (n == 0)
            return 0;

        else {

            return (n % 2 + 10 * find(n / 2));
        }

    }
}
