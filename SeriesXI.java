import java.util.Scanner;

public class SeriesXI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double num = 95.0;
        System.out.print(num + " ");
        double increment = 20.5;

        for (int i = 0; i < n; i++) {
            num += increment;
            System.out.print(num + " ");
            increment += 2;
        }
        sc.close();

    }
}
