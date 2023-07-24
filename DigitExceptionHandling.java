import java.util.Scanner;

public class DigitExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        try {
            int count = countNumbersWithDigitsLessThan5(n, m);
            System.out.println(count);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int countNumbersWithDigitsLessThan5(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isDigitsLessThan5(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isDigitsLessThan5(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit >= 5) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
