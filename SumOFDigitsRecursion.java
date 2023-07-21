import java.util.Scanner;

public class SumOFDigitsRecursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int result = getNum(n);
        System.out.println("The sum of digits in " + n + " is " + result);

    }

    public static int getNum(int n) {
        int num;
        if (n == 0) {
            return n;
        } else {
            num = n % 10;
            n /= 10;
        }
        return num + getNum(n);
    }
}
