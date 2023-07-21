import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 200) {
            int a = (int) (number * 0.5);
            System.out.printf("Rs.%d", a);

        } else if (number <= 400) {
            int b = (int) ((number * 0.65) + 100);
            System.out.printf("Rs.%d", b);

        } else if (number <= 600) {
            int c = (int) ((number * 0.80) + 200);
            System.out.printf("Rs.%d", c);

        } else if (number > 600) {
            int d = (int) ((number * 1.25) + 425);
            System.out.printf("Rs.%d", d);
        }

        sc.close();
    }
}
