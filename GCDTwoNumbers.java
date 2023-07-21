import java.util.Scanner;

public class GCDTwoNumbers {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // sc.close();
        // int result = gcd(Math.max(a, b), Math.min(a, b));
        // System.out.println("G.C.D of " + a + " and " + b + " is " + result);

        // }

        // public static int gcd(int a, int b) {
        // if (b == 0) {
        // return a;
        // }
        // return gcd(b, a % b);
        // }
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        int gcd = computeGCD(num1, num2);
        System.out.println("G.C.D of " + num1 + " and " + num2 + " is " + gcd);
    }

    public static int computeGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return computeGCD(num2, num1 % num2);
    }
}
