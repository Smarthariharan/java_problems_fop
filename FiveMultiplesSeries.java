import java.util.Scanner;

public class FiveMultiplesSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 6;
        System.out.print(num + " ");

        for (int i = 1; i < n; i++) {
            int multiple = num + (5 * i);
            System.out.print(multiple + " ");
            num = multiple;
        }
        sc.close();

    }
}
