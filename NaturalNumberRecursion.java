import java.util.Scanner;

public class NaturalNumberRecursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        int sum = sumOfNaturalNumbers(n);
        System.out.println(sum);
    }

    public static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumOfNaturalNumbers(n - 1);
        }
    }
}
