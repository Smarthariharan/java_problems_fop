import java.util.Scanner;

public class AverageSpeedExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        try {
            double n = a * b;
            double m = a + b;

            System.out.println((double) 2 * (n / m));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
