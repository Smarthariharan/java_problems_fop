import java.util.Scanner;

public class TravellingExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        try {
            double result = n + m;
            System.out.println((double) 200 / result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
