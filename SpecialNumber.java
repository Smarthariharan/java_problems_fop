import java.util.ArrayList;
import java.util.Scanner;

public class SpecialNumber {
    public static boolean isSpecialNumber(int num) {
        int digit1 = num / 10;
        int digit2 = num % 10;
        return (digit1 + digit2) + (digit1 * digit2) == num;
    }

    public static ArrayList<Integer> findSpecialNumbers(int m, int n) {
        ArrayList<Integer> specialNumbers = new ArrayList<>();
        for (int num = m; num <= n; num++) {
            if (isSpecialNumber(num)) {
                specialNumbers.add(num);
            }
        }
        return specialNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        ArrayList<Integer> result = findSpecialNumbers(m, n);
        for (int num : result) {
            System.out.println(num);
        }
    }
}
