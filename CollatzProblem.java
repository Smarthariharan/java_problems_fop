import java.util.Scanner;

public class CollatzProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printCollatzSequence(n);

        scanner.close();
    }

    public static void printCollatzSequence(int n) {
        int count = 0;
        System.out.println(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }

            System.out.println(n);
            count++;
        }

        System.out.println(count);
    }
}
