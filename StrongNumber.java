import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        if (isStrongNumber(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isStrongNumber(int num) {
        int originalNumber = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNumber;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
