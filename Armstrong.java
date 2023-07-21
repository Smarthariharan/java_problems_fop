import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int originalNumber;
        int remainder;
        int result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;

        }
        if (result == number) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }

        sc.close();
    }
}
