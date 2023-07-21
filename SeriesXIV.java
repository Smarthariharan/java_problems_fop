import java.util.Scanner;

public class SeriesXIV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 2;
        System.out.print(t + " ");
        int u = 0;
        for (int i = 1; i < n; i++) {
            u = (t * 2) + 1;
            t = u;
            System.out.print(t + " ");

        }

        sc.close();
    }
}
