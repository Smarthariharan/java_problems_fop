import java.util.Scanner;

public class SeriesX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 2;
        for (int i = 1; i <= n; i++) {
            int result = (num * num) - 1;
            System.out.print(num + " ");
            num = result;

        }
        sc.close();
    }

}