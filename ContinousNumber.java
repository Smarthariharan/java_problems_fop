import java.util.Scanner;

public class ContinousNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a <= b) {
            System.out.println(a);
            a++;
        }

        sc.close();
    }
}
