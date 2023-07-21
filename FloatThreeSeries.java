import java.util.Scanner;

public class FloatThreeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        float num = 0.5f;
        System.out.print(num + " ");

        for (int i = 1; i < n; i++) {
            float number = num * 3;
            num = number;
            System.out.print(num + " ");
        }

        sc.close();
    }
}
