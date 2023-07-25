import java.util.Scanner;

public class ArithmeticCandO {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(c - d);

        int e = scanner.nextInt();
        int f = scanner.nextInt();
        System.out.println(e * f);

        int g = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.print(g / h);
        scanner.close();
    }
}
