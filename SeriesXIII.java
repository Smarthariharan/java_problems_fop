import java.util.Scanner;

public class SeriesXIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 5;
        int t = 11;
        System.out.print(s + " ");
        int u = 0;
        for (int i = 1; i < n; i++) {
            u = s + t;
            t += 22;
            s = u;
            System.out.print(u + " ");

        }

        sc.close();
    }
}
