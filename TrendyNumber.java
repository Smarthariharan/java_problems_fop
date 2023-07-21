import java.util.Scanner;

public class TrendyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total_digits = (int) Math.log10(n) + 1;

        n = (int) (n / Math.pow(10, total_digits / 2)) % 10;

        if (n % 3 == 0) {
            System.out.println("Trendy Number");

        } else {
            System.out.println("Not a trendy number");
        }

        sc.close();
    }
}
