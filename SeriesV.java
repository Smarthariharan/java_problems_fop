import java.util.Scanner;

public class SeriesV {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 11;

        for (int i = 1; i <= n; i++) {
            int result = num1 * num1;
            num1 = num1 + 4;
            System.out.print(result + " ");
        }

        sc.close();
    }
}
