import java.util.Scanner;

public class RangeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = a + 1;
        int v = a;

        while (i <= b) {
            v += i;
            i++;
        }

        System.out.println(v);

        sc.close();
    }
}
