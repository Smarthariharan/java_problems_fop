import java.util.Scanner;

public class MADtoLSDRecursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        printDigitsMSDToLSD(num);

        sc.close();
    }

    public static void printDigitsMSDToLSD(int num) {
        if (num < 10) {
            System.out.println(num);
            return;
        }

        printDigitsMSDToLSD(num / 10);
        System.out.println(num % 10);
    }
}