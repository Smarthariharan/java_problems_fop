import java.util.Scanner;

public class WorkingDaysExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int d1 = sc.nextInt();
        int h1 = sc.nextInt();
        int w1 = sc.nextInt();
        int p2 = sc.nextInt();
        int d2 = sc.nextInt();
        int h2 = sc.nextInt();
        sc.close();

        try {
            int numerator = p1 * d1 * h1;
            int n = p2 * d2 * h2 * w1;
            System.out.println((double) n / numerator);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
