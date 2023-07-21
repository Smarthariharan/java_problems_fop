import java.util.Scanner;

public class ComputePowerRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int pow = sc.nextInt();
        sc.close();

        int result = power(base, pow);
        System.out.println("The value of " + base + " power " + pow + " is " + result);
    }

    public static int power(int base, int pow) {
        if (pow == 0) {
            return 1;
        } else if (base == 0) {
            return 0;
        } else if (pow == 1) {
            return base;
        }
        return base * power(base, pow - 1);
    }
}
