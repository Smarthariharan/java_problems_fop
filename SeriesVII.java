import java.util.Scanner;

public class SeriesVII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 2;
        System.out.print(a + " " + b + ".0" + " ");

        for (int i = 3; i <= n; i++) {
            if (i % 2 == 1) {
                a = a * 3;
                System.out.print(a + ".0" + " ");
            } else {
                b = b * 3;
                System.out.print(b + ".0" + " ");
            }

        }

        sc.close();
    }
}
