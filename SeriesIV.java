import java.util.Scanner;

public class SeriesIV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, pr = 0;
        n = sc.nextInt();
        sc.close();
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                pr = (int) (Math.pow(i, 2) - 2);
                System.out.print(pr + " ");
            } else {
                pr = (int) (Math.pow(i, 2) - 1);
                System.out.printf(pr + " ");
            }
        }

    }
}
