import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 8 == 0) {
                count++;
            } else {
                break;
            }
        }

        sc.close();

        System.out.println("The number of valid numbers entered is " + count);
    }
}
