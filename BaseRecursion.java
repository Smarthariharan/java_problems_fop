import java.util.Scanner;

public class BaseRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int decimal = sc.nextInt();

        int base = sc.nextInt();

        String result = decimalToBase(decimal, base);
        System.out.println("Enter the base to which you want to convert ");
        System.out.println(result);

        sc.close();
    }

    public static String decimalToBase(int decimal, int base) {
        if (decimal == 0) {
            return "0";
        }

        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (decimal < base) {
            return Character.toString(digits.charAt(decimal));
        }

        return decimalToBase(decimal / base, base) + Character.toString(digits.charAt(decimal % base));
    }
}
