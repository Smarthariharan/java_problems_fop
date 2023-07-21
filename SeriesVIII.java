import java.util.Scanner;

public class SeriesVIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int num = 4;
        System.out.print(num + " ");
        for (int i = 1; i < n; i++) {
            int power = (int) (Math.pow(i, 2));
            int result = num + power;
            num = result;
            System.out.print(num + " ");

        }
    }
}
