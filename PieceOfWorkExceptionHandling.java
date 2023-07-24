import java.util.Scanner;

public class PieceOfWorkExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        try {
            int n = a * b;
            int m = a + b;
            System.out.println((double) n / m);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
