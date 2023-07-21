import java.util.Scanner;

public class NumberOfDigitsRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int result = getNum(n);
        System.out.println("The number of digits in " + n + " is " + result);

    }

    public static int getNum(int n) {

        int count = 0;
        if (n == 0) {
            count++;
            return count;
        } else {
            n /= 10;
            count++;
        }
        return count + getNum(n);
    }
}
